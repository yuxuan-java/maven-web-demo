package org.yuxuan.spring.taskscheduled.service;

import org.joda.time.DateTime;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
/**
 * 通过@Scheduled注解声明方法是计划任务
 */
@Service
public class TaskScheduledService {
	
	private static final String pattern = "HH:mm:ss";
	
	/**
	 * 使用fixedRate属性每隔固定时间执行
	 */
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("reportCurrentTime: " + new DateTime().toString(pattern));
	}
	
	/**
	 * 使用cron属性可以按照cron表达式指定的时间执行
	 */
	@Scheduled(cron = "*/10 * * * * ?")
	public void fixTimeExecution() {
		System.out.println("fixTimeExecution: " + new DateTime().toString(pattern));
	}
	
}
