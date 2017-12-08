package org.yuxuan.spring.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("org.yuxuan.spring.aop")
@EnableAspectJAutoProxy	//	ʹ��@EnableAspectJAutoProxyע�⿪��Spring��AspectJ��֧��
public class AopConfig {
}
