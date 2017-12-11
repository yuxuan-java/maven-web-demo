package org.yuxuan.spring.fortest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.yuxuan.spring.fortest.bean.TestBean;

@Configuration
public class TestConfig {
	
	@Bean
	@Profile("dev")
	public TestBean devTestBean() {
		return new TestBean("fom development prefile");
	}
	
	@Bean
	@Profile("prod")
	public TestBean prodTestBean() {
		return new TestBean("from production profile");
	}
	
}
