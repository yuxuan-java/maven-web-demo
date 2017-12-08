package org.yuxuan.spring.taskscheduled.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.taskscheduled.config.TaskSchedulingConfig;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	@SuppressWarnings("all")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskSchedulingConfig.class);
	}
	
}
