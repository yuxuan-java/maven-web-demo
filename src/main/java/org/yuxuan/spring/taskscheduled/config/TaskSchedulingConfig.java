package org.yuxuan.spring.taskscheduled.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("org.yuxuan.spring.taskscheduled")
@EnableScheduling	//	通过@EnableScheduling注解开启对计划任务的支持
public class TaskSchedulingConfig {
}
