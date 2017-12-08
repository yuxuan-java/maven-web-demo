package org.yuxuan.spring.taskexecutor.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.taskexecutor.config.TaskExecutorConfig;
import org.yuxuan.spring.taskexecutor.service.AsyncTaskService;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		
		for (int i = 0; i < 10; i++) {
			asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPuls(i);
		}
		
		context.close();
	}
	
}
