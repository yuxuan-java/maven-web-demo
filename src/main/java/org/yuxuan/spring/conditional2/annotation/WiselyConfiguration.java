package org.yuxuan.spring.conditional2.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * �Զ������ע��
 *
 * @author yuxuan.han
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration	//	���@Configurationע��
@ComponentScan	//	���@ComponentScanע��
public @interface WiselyConfiguration {
	//	����value����
	String[] value() default {};
}
