package org.yuxuan.spring.event.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.event.config.EventConfig;
import org.yuxuan.spring.event.publish.DemoPublisher;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(EventConfig.class);
		
		DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
		
		demoPublisher.publish("Hello application event!");
		
		context.close();
	}
	
}
