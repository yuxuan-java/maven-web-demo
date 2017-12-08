package org.yuxuan.spring.conditional2.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义组合注解
 *
 * @author yuxuan.han
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration	//	组合@Configuration注解
@ComponentScan	//	组合@ComponentScan注解
public @interface WiselyConfiguration {
	//	覆盖value参数
	String[] value() default {};
}
