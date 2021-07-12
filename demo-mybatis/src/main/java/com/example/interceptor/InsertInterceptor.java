//package com.example.interceptor;
//
//import org.apache.ibatis.executor.Executor;
//import org.apache.ibatis.executor.statement.StatementHandler;
//import org.apache.ibatis.mapping.BoundSql;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.plugin.*;
//
//import java.lang.reflect.Method;
//import java.sql.Statement;
//import java.util.Properties;
//@Intercepts({@Signature(
//		type= StatementHandler.class,
//		method = "update",
//		args = {Statement.class})})
//public class InsertInterceptor implements Interceptor {
//	private Properties properties = new Properties();
//	@Override
//	public Object intercept(Invocation invocation) throws Throwable {
//
//		StatementHandler handler = (StatementHandler)invocation.getTarget();
//		Method update = invocation.getMethod();
//		MappedStatement mappedStatement= (MappedStatement) invocation.getArgs()[0];
//		BoundSql boundSql=mappedStatement.getBoundSql(invocation.getArgs()[1]);
//		//executor.update()
//		String sql=boundSql.getSql();
//		System.out.println(sql);
//		return invocation.proceed();
//	}
//
//	@Override
//	public Object plugin(Object o) {
//		return Plugin.wrap(o, this);
//	}
//
//	@Override
//	public void setProperties(Properties properties) {
//		this.properties = properties;
//	}
//}
