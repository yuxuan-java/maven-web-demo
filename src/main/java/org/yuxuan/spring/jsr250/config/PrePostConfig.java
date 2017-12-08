package org.yuxuan.spring.jsr250.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.yuxuan.spring.jsr250.service.BeanWayService;
import org.yuxuan.spring.jsr250.service.JSR250WayService;

@Configuration
@ComponentScan("org.yuxuan.spring.jsr250")
public class PrePostConfig {
	
	/**
	 * ʹ��initMethod��destroyMethodִ��Bean��init��destroy����
	 * @return
	 */
	@Bean(initMethod = "init", destroyMethod = "destroy")
	public BeanWayService beanWayService() {
		return new BeanWayService();
	}
	
	@Bean
	public JSR250WayService jsr250Service() {
		return new JSR250WayService();
	}
	
}
