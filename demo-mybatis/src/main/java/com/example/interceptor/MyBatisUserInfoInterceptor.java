package com.example.interceptor;

import cn.hutool.json.JSONArray;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.JdbcParameter;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.expression.operators.relational.ItemsList;
import net.sf.jsqlparser.expression.operators.relational.MultiExpressionList;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.update.Update;
import org.apache.ibatis.builder.StaticSqlSource;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.*;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.scripting.xmltags.DynamicSqlSource;
import org.apache.ibatis.scripting.xmltags.SqlNode;
import org.apache.ibatis.type.JdbcType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

@Intercepts({@Signature(type = Executor.class, method = "update", args = {MappedStatement.class, Object.class})})
public class MyBatisUserInfoInterceptor implements Interceptor {
	static final String CREATE_USER = "create_user";
	static final String UPDATE_USER = "update_user";
	private static final Logger logger = LoggerFactory.getLogger(MyBatisUserInfoInterceptor.class);

	@Override
	public Object intercept(Invocation invocation) throws Throwable {

		MappedStatement ms = (MappedStatement) invocation.getArgs()[0];

		//可以判断是insert还是update等
		SqlCommandType sqlCommandType=ms.getSqlCommandType();
		switch (sqlCommandType){
			case INSERT: return insert(invocation);
			case UPDATE: return update(invocation);
			default: return invocation.proceed();
		}

	}

	@Override
	public Object plugin(Object o) {
		return Plugin.wrap(o, this);
	}

	@Override
	public void setProperties(Properties properties) {
		logger.warn(properties.toString());
	}


	/***
	 * 动态添加修改人
	 */
	public Object update(Invocation invocation) throws InvocationTargetException, IllegalAccessException, JSQLParserException {
		MappedStatement ms = (MappedStatement) invocation.getArgs()[0];
		//获得执行参数，当前仅支持了参数为map的情况
		Object param=invocation.getArgs()[1];
		//判断参数是否是map
		Boolean isMapParam = param instanceof Map;

		SqlSource sqlSource = ms.getSqlSource();
		BoundSql boundSql;
		if(sqlSource instanceof DynamicSqlSource){
			boundSql=sqlSource.getBoundSql(param);
		}else {
			boundSql = sqlSource.getBoundSql(ms.getParameterMap());
		}
		String mySql = boundSql.getSql();

		Update update = (Update) CCJSqlParserUtil.parse(mySql);
		//是否包含修改人
		Boolean isExist = update.getColumns().stream().anyMatch(p -> UPDATE_USER.equals(p.getColumnName()));
		//如果修改人已经有了，不做任何处理
		if (isExist) {
			return invocation.proceed();
		}

		Column updateColumn=new Column(UPDATE_USER);
		update.addColumns(updateColumn);
		update.getExpressions().add(new JdbcParameter());

		mySql=update.toString();

		//处理参数
		Map<String,Object> paramMap=(Map<String, Object>) param;
		paramMap.put(UPDATE_USER,"xiaohong");

		//补充参数信息，如参数名称，参数的java类型，参数的jdbc类型等
		List<ParameterMapping> parameterMappingList = boundSql.getParameterMappings();
		if(!parameterMappingList.stream().anyMatch(p->UPDATE_USER.equals(p.getProperty()))){
			ParameterMapping updateUserMapping = new ParameterMapping.Builder(ms.getConfiguration(), UPDATE_USER, String.class).jdbcType(JdbcType.VARCHAR).build();
			//ParameterMapping的位置很重要
			int columnIndex=update.getColumns().indexOf(updateColumn);
			parameterMappingList.add(columnIndex,updateUserMapping);
		}

		SqlSource mySqlSource = new StaticSqlSource(ms.getConfiguration(), mySql, parameterMappingList);
		ms = new MappedStatement.Builder(ms.getConfiguration(), ms.getId(), mySqlSource, ms.getSqlCommandType()).build();
		invocation.getArgs()[0]=ms;
		return invocation.proceed();
	}


//	public boolean checkBeforeInsert(Invocation invocation){
//
//	}
	/***
	 * 动态添加新增人
	 */
	public Object insert(Invocation invocation) throws JSQLParserException, InvocationTargetException, IllegalAccessException {
		MappedStatement ms = (MappedStatement) invocation.getArgs()[0];
		//获得执行参数，当前仅支持了参数为map的情况
		Object param=invocation.getArgs()[1];
		//判断参数是否是map
		Boolean isMapParam = param instanceof Map;


		SqlSource sqlSource = ms.getSqlSource();
		BoundSql boundSql;
		if(sqlSource instanceof DynamicSqlSource){
			boundSql=sqlSource.getBoundSql(param);
		}else {
			boundSql = sqlSource.getBoundSql(ms.getParameterMap());
		}
		String mySql = boundSql.getSql();
		Insert insert = (Insert) CCJSqlParserUtil.parse(mySql);
		ItemsList itemsList=insert.getItemsList();

		//是否包含创建人
		Boolean isExist = insert.getColumns().stream().anyMatch(p -> CREATE_USER.equals(p.getColumnName()));
		//如果创建人已经有了,或者入参类型不是map，不做任何处理
		if (isExist || !isMapParam) {
			return invocation.proceed();
		}

		//原始参数长度
		int columnLength=0;
		if(itemsList instanceof ExpressionList){
			//插入单行
			return insertSingleLine(invocation,ms,sqlSource,boundSql,insert);
		}else if(itemsList instanceof MultiExpressionList){
			//补充列,批量操作 如INSERT INTO table (col) VALUES (?),(?) 中的？部分
			return insertMultipleLine(invocation,ms,sqlSource,boundSql,insert);
		}
		return invocation.proceed();
	}

	private Object insertMultipleLine(Invocation invocation, MappedStatement ms, SqlSource sqlSource, BoundSql boundSql, Insert insert) throws InvocationTargetException, IllegalAccessException {
		//获得执行参数，当前仅支持了参数为map的情况
		if(sqlSource instanceof DynamicSqlSource){
			DynamicSqlSource dynamicSqlSource=(DynamicSqlSource)sqlSource;
			Class<?> clazz=DynamicSqlSource.class;
			Field[] fields=clazz.getDeclaredFields();
			JSONArray ja=new JSONArray();
			for (Field field : fields) {
				field.setAccessible(true);
				SqlNode sqlNode = (SqlNode) field.get("rootSqlNode");
				System.out.println(sqlNode);
			}
		}
		Object param=invocation.getArgs()[1];
		//补充列 如INSERT INTO table (col) VALUES (?) 中的？部分
		//sql中补充创建人字段
		//补充列 如INSERT INTO table (col) VALUES (?) 中的col部分
		//insert.addColumns(new Column(CREATE_USER));

		ItemsList itemsList=insert.getItemsList();
		List<ExpressionList> exprList = ((MultiExpressionList) itemsList).getExprList();
		for (ExpressionList expressionList : exprList) {
		//	expressionList.getExpressions().add(new JdbcParameter());
		}

		String mySql=insert.toString();

		//处理参数
		Map<String,Object> paramMap=(Map<String, Object>) param;
		Object listObject=paramMap.get("list");
		if(listObject instanceof List){
			for (Object o : (List) listObject) {
				Map<String,Object> p= (Map<String, Object>) o;
				//p.put(CREATE_USER,"xiaoming");
			}
		}

		//paramMap.put(CREATE_USER,"xiaoming");

		//补充参数信息，如参数名称，参数的java类型，参数的jdbc类型等
		List<ParameterMapping> parameterMappingList = boundSql.getParameterMappings();
//		List<ParameterMapping> translatedParameterMappingList = parameterMappingList.stream().map()
		int originalColumnsLength=insert.getColumns().size()-1;
		//此处，单行插入和多行插入可以一视同仁，INSERT INTO table (col) VALUES (?),(?),这里插入的值，和"？"一一对应
		int endIndex=parameterMappingList.size();
		for (int i = endIndex; i >0; i=i-originalColumnsLength) {
			ParameterMapping createUserMapping = new ParameterMapping.Builder(ms.getConfiguration(), CREATE_USER, String.class).jdbcType(JdbcType.VARCHAR).build();
			//parameterMappingList.add(i,createUserMapping);
		}

		SqlSource mySqlSource = new StaticSqlSource(ms.getConfiguration(), mySql, parameterMappingList);
		ms = new MappedStatement.Builder(ms.getConfiguration(), ms.getId(), mySqlSource, ms.getSqlCommandType()).build();
		invocation.getArgs()[0]=ms;
		return invocation.proceed();

	}

	private Object insertSingleLine(Invocation invocation, MappedStatement ms,SqlSource sqlSource,BoundSql boundSql,Insert insert) throws InvocationTargetException, IllegalAccessException {
		//获得执行参数，当前仅支持了参数为map的情况
		Object param=invocation.getArgs()[1];
		//补充列 如INSERT INTO table (col) VALUES (?) 中的？部分
		//sql中补充创建人字段
		//补充列 如INSERT INTO table (col) VALUES (?) 中的col部分
		insert.addColumns(new Column(CREATE_USER));

		((ExpressionList) insert.getItemsList()).getExpressions().add(new JdbcParameter());

		String mySql=insert.toString();

		//处理参数
		Map<String,Object> paramMap=(Map<String, Object>) param;
		paramMap.put(CREATE_USER,"xiaoming");

		//补充参数信息，如参数名称，参数的java类型，参数的jdbc类型等
		List<ParameterMapping> parameterMappingList = boundSql.getParameterMappings();
		int originalColumnsLength=insert.getColumns().size()-1;
		//此处，单行插入和多行插入可以一视同仁，INSERT INTO table (col) VALUES (?),(?),这里插入的值，和"？"一一对应
		int endIndex=parameterMappingList.size();
		for (int i = endIndex; i >0; i=i-originalColumnsLength) {
			ParameterMapping createUserMapping = new ParameterMapping.Builder(ms.getConfiguration(), CREATE_USER, String.class).jdbcType(JdbcType.VARCHAR).build();
			parameterMappingList.add(i,createUserMapping);
		}

		SqlSource mySqlSource = new StaticSqlSource(ms.getConfiguration(), mySql, parameterMappingList);
		ms = new MappedStatement.Builder(ms.getConfiguration(), ms.getId(), mySqlSource, ms.getSqlCommandType()).build();
		invocation.getArgs()[0]=ms;
		return invocation.proceed();
	}


}

