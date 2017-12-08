package org.yuxuan.spring.jsr250.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.jsr250.config.PrePostConfig;
import org.yuxuan.spring.jsr250.service.BeanWayService;
import org.yuxuan.spring.jsr250.service.JSR250WayService;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(PrePostConfig.class);
		
		BeanWayService beanWayService = context.getBean(BeanWayService.class);
		JSR250WayService bean = context.getBean(JSR250WayService.class);
		
		context.close();
	}
	
}