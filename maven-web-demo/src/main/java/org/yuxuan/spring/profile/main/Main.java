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
		
		//	������profile
		context.getEnvironment().setActiveProfiles("dev");
//		context.getEnvironment().setActiveProfiles("prod");
		//	��ע��Bean�������࣬��Ȼ�ᱨBeanδ����Ĵ���
		context.register(ProfileConfig.class);
		//	ˢ������
		context.refresh();
		
		DemoBean demoBean = context.getBean(DemoBean.class);
		
		System.out.println(demoBean.getContent());
		
		context.close();
	}
	
}
