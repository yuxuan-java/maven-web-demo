package org.yuxuan.spring.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.yuxuan.spring.profile.bean.DemoBean;

@Configuration
public class ProfileConfig {
	
	@Bean
	@Profile("dev")
	public DemoBean devDemoBean() {
		return new DemoBean("from development profile");
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean() {
		return new DemoBean("from product profile");
	}
	
}
