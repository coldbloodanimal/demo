//package com.example.interceptor;
//
//import cn.hutool.core.util.ReflectUtil;
//import org.apache.ibatis.cache.CacheKey;
//import org.apache.ibatis.executor.Executor;
//import org.apache.ibatis.executor.statement.RoutingStatementHandler;
//import org.apache.ibatis.executor.statement.StatementHandler;
//import org.apache.ibatis.mapping.BoundSql;
//import org.apache.ibatis.mapping.MappedStatement;
//import org.apache.ibatis.plugin.*;
//import org.apache.ibatis.session.RowBounds;
//import org.springframework.stereotype.Component;
//
//
//import java.lang.reflect.Method;
//import java.sql.Connection;
//import java.util.Properties;
//
//@Intercepts({@Signature(method = "prepare", type = StatementHandler.class, args = {Connection.class, Integer.class})})
//public class BiuBiuInterceptor implements Interceptor {
//	private Properties properties = new Properties();
//	@Override
//	public Object intercept(Invocation invocation) throws Throwable {
//
//		if (invocation.getTarget() instanceof StatementHandler) {
//			String dataSoureType = DynamicDataSourceContextHolder.getDateSoureType();
//			// judge dataSource type ,because sqlite can't use internal.core_project this express
//			// so we need to add "" for it or delete this 'internal.'
//			if (DataSourceType.SQLITE.name().equals(dataSoureType)) {
//				RoutingStatementHandler handler = (RoutingStatementHandler) invocation.getTarget();
//				StatementHandler delegate = (StatementHandler) ReflectUtil.getFieldValue(handler, "delegate");
//				BoundSql boundSql = delegate.getBoundSql();
//				String sql = boundSql.getSql();
//				sql = sql.replace("internal.", " ");
//				ReflectUtil.setFieldValue(boundSql, "sql", sql);
//			}
//		}
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
