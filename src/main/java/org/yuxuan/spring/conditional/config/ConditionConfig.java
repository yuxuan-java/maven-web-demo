package org.yuxuan.spring.conditional.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.yuxuan.spring.conditional.condition.LinuxCondition;
import org.yuxuan.spring.conditional.condition.WindowsCondition;
import org.yuxuan.spring.conditional.service.ListService;
import org.yuxuan.spring.conditional.service.impl.LinuxListService;
import org.yuxuan.spring.conditional.service.impl.WindowsListService;

@Configuration
@ComponentScan("org.yuxuan.spring.conditional")
public class ConditionConfig {
	
	@Bean
	@Conditional(WindowsCondition.class)
	public ListService windowsListService() {
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxListService() {
		return new LinuxListService();
	}
	
}
