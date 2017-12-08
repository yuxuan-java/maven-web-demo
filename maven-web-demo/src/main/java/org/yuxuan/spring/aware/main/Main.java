package org.yuxuan.spring.aware.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.aware.config.AwareConfig;
import org.yuxuan.spring.aware.service.AwareService;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AwareConfig.class);
		
		AwareService awareService = context.getBean(AwareService.class);
		
		awareService.outputResult();
		
		context.close();
	}
	
}
