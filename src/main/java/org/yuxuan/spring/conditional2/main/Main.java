package org.yuxuan.spring.conditional2.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.conditional2.config.DemoConfig;
import org.yuxuan.spring.conditional2.service.DemoService;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		DemoService demoService = context.getBean(DemoService.class);
		
		demoService.outputResult();
		
		context.close();
	}
	
}
