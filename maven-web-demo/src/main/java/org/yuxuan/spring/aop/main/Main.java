package org.yuxuan.spring.aop.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.aop.config.AopConfig;
import org.yuxuan.spring.aop.service.DemoAnnotationService;
import org.yuxuan.spring.aop.service.DemoMethodService;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AopConfig.class);
		
		DemoMethodService demoMethodService = 
				context.getBean(DemoMethodService.class);
		DemoAnnotationService demoAnnotationService = 
				context.getBean(DemoAnnotationService.class);
		
		demoMethodService.add();
		System.out.println("------------------");
		demoAnnotationService.add();
		
		context.close();
	}
	
}
