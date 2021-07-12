package com.example.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author dang7
 */
//这个注解是方法级别的
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PrintModelProperty {

	// 暂时不需要
	String field() default  "";

	String text() default  "";

	int width() default 100;

	String align() default "";

	int sort() default 0;

	boolean hidden() default false;

}
