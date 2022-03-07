package com.example.interceptor;

import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.ExpressionVisitor;
import net.sf.jsqlparser.expression.JdbcParameter;
import net.sf.jsqlparser.expression.LongValue;
import net.sf.jsqlparser.expression.operators.relational.ExpressionList;
import net.sf.jsqlparser.expression.operators.relational.ItemsList;
import net.sf.jsqlparser.expression.operators.relational.ItemsListVisitor;
import net.sf.jsqlparser.expression.operators.relational.MultiExpressionList;
import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.parser.SimpleNode;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.statement.insert.Insert;
import net.sf.jsqlparser.statement.select.SubSelect;
import net.sf.jsqlparser.statement.update.Update;

public class SqlReplaceUtils {
	public static void main(String[] args) throws JSQLParserException {
		insert();
	}

	public static void insert() throws JSQLParserException {
		Update insert = (Update) CCJSqlParserUtil.parse("update\n" +
				"\t\tsup_spec_hos a inner join\n" +
				"\t\tsys_sup_apply b on a.chos_id=b.chos_id and a.csup_id=b.csup_id and a.spec_id=b.data_id\n" +
				"\t\tSET a.check_state = ?,\n" +
				"\t\ta.check_note  = ?,\n" +
				"\t\ta.check_date = ?\n" +
				"\t\twhere b.app_id in\n" +
				"\t\t (  \n" +
				"\t\t\t?\n" +
				"\t\t )");
		System.out.println(insert.toString());



		System.out.println(insert.toString());
	}

	public static void update() throws JSQLParserException {
		Update update = (Update) CCJSqlParserUtil.parse("update users" +
				"        set username = ?" +
				"        where id = ?");
		System.out.println(update.toString());


//adding another column
		update.getColumns().add(new Column("col3"));


		update.getExpressions().add(new JdbcParameter());

//adding another value (the easy way)
//		((ExpressionList)insert.getItemsList()).getExpressions().add(new LongValue(1));

		System.out.println(update.toString());
	}
}
