package org.yuxuan.spring.taskscheduled.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("org.yuxuan.spring.taskscheduled")
@EnableScheduling	//	ͨ��@EnableSchedulingע�⿪���Լƻ������֧��
public class TaskSchedulingConfig {
}
