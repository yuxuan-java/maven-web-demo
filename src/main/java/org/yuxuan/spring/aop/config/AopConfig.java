package org.yuxuan.spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.yuxuan.spring.aop")
@EnableAspectJAutoProxy	//	使用@EnableAspectJAutoProxy注解开启Spring对AspectJ的支持
public class AopConfig {
}
