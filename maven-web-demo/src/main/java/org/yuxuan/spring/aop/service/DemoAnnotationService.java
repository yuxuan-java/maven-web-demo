package org.yuxuan.spring.aop.service;

import org.springframework.stereotype.Service;
import org.yuxuan.spring.aop.annotation.Action;

/**
 * 试用注解的被拦截类
 *
 * @author yuxuan.han
 */
@Service
public class DemoAnnotationService {
	
	@Action(name = "注解式拦截的add操作")
	public void add(){
		System.out.println("org.yuxuan.spring.aop.service.DemoAnnotationService.add()");
	}
	
}
