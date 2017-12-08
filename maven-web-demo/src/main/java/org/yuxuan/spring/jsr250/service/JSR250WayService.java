package org.yuxuan.spring.jsr250.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	
	public JSR250WayService() {
		super();
		System.out.println("初始化构造函数-JSR250WayService");
	}
	
	@PostConstruct	//	在构造函数执行完成之后执行
	public void init() {
		System.out.println("jsr250-init-method");
	}
	
	@PreDestroy		//	Bean销毁之前执行
	public void destory() {
		System.out.println("jsr250-destory-method");
	}
	
}
