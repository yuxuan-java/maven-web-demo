package org.yuxuan.spring.taskexecutor.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	/**
	 * 使用@Aysnc注解表明该方法是个异步方法
	 * 		如果注解在类级别，则表明该类所有的方法都是异步方法
	 * 		这里的方法自动被注入使用ThreadPoolTaskExecutor作为TaskExecutor。
	 * !!!注意：
	 * 		此处pom.xml文件中Spring-context与Spring-aop的引用版本应保持一致，
	 * 		否则可能出现ClassNotFound:AbstractBeanFactoryAwareAdvisingPostProcessor错误。
	 * @param i
	 */
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务: " + i);
	}
	
	@Async
	public void executeAsyncTaskPuls(Integer i) {
		System.out.println("执行异步任务+1: " + (i + 1));
	}
	
}
