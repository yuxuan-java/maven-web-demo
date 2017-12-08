package org.yuxuan.spring.ioc.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.ioc.config.IocConfig;
import org.yuxuan.spring.ioc.service.UseFunctionService;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class);
		
		UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
		
		System.out.println(useFunctionService.useSayHello("java config"));
		
		context.close();
	}
	
}
