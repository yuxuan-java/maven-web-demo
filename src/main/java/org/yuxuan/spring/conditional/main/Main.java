package org.yuxuan.spring.conditional.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.conditional.config.ConditionConfig;
import org.yuxuan.spring.conditional.service.ListService;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConditionConfig.class);
		
		ListService listService = context.getBean(ListService.class);
		
		System.out.println("操作系统: " + context.getEnvironment().getProperty("os.name"));
		System.out.println("列表命令: " + listService.showListCmd());
		
		context.close();
	}
	
}
