package org.yuxuan.spring.conditional2.config;

import org.springframework.context.annotation.Bean;
import org.yuxuan.spring.conditional2.annotation.WiselyConfiguration;
import org.yuxuan.spring.conditional2.service.DemoService;
/**
 * ʹ�����ע��
 *
 * @author yuxuan.han
 */
@WiselyConfiguration("org.yuxuan.spring.conditional2")
public class DemoConfig {
	
	@Bean
	public DemoService demoService() {
		return new DemoService();
	}
	
}
