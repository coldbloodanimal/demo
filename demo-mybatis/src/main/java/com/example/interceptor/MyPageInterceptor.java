package com.example.interceptor;

import com.example.users.Users;
import org.apache.ibatis.builder.StaticSqlSource;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.ParameterMapping;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.scripting.defaults.RawSqlSource;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.JDBCType;
import java.util.List;
import java.util.Properties;

@Intercepts({@Signature(type = Executor.class,method = "update",args = {MappedStatement.class,Object.class})})
public class MyPageInterceptor implements Interceptor {
	private static final Logger logger= LoggerFactory.getLogger(MyPageInterceptor.class);
	@Override
	public Object intercept(Invocation invocation) throws Throwable {

		MappedStatement ms= (MappedStatement) invocation.getArgs()[0];

		//SqlSource sqlSource=new StaticSqlSource()
		SqlSource sqlSource=ms.getSqlSource();
		BoundSql boundSql=sqlSource.getBoundSql(ms.getParameterMap());
		List<ParameterMapping> parameterMappingList = boundSql.getParameterMappings();
		ParameterMapping passwordMapping=new ParameterMapping.Builder(ms.getConfiguration(),"password",String.class).jdbcType(JdbcType.VARCHAR).build();
		parameterMappingList.add(passwordMapping);
		String mySql=boundSql.getSql();
		mySql="insert into users (id, username ,password) values (?, ? ,?)";
		SqlSource mySqlSource=new StaticSqlSource(ms.getConfiguration(),mySql,parameterMappingList);
		invocation.getArgs()[0]=new MappedStatement.Builder(ms.getConfiguration(),ms.getId(),mySqlSource,ms.getSqlCommandType()).build();
		Users user= (Users) invocation.getArgs()[1];
		user.setPassword("反射测试");
		invocation.getArgs()[1]=user;


		logger.warn(invocation.toString());
		return invocation.proceed();
	}
	@Override
	public Object plugin(Object o) {
		return Plugin.wrap(o,this);
	}
	@Override
	public void setProperties(Properties properties) {
		logger.warn(properties.toString());
	}
}

