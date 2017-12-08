package org.yuxuan.spring.scope.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.yuxuan.spring.scope.config.ScopeConfig;
import org.yuxuan.spring.scope.service.DemoPrototypeService;
import org.yuxuan.spring.scope.service.DemoSingletonService;

public class Main {
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ScopeConfig.class);
		
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		DemoPrototypeService p1 = context.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = context.getBean(DemoPrototypeService.class);
		
		System.out.println("s1”Îs2: " + s1.equals(s2));
		System.out.println("p1”Îp2: " + p1.equals(p2));
		
		context.close();
	}
	
}
