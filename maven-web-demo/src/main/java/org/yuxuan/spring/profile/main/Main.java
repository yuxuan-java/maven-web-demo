package org.yuxuan.spring.profile.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.profile.bean.DemoBean;
import org.yuxuan.spring.profile.config.ProfileConfig;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext();
		
		//	先设置profile
		context.getEnvironment().setActiveProfiles("dev");
//		context.getEnvironment().setActiveProfiles("prod");
		//	后注解Bean的配置类，不然会报Bean未定义的错误
		context.register(ProfileConfig.class);
		//	刷新容器
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		
		context.close();
	}
	
}
