package org.yuxuan.spring.el.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.el.config.ElConfig;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ElConfig.class);
		
		ElConfig config = context.getBean(ElConfig.class);
		config.outputResource();
		
		context.close();
	}
	
}
