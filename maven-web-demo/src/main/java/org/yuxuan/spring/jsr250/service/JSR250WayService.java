package org.yuxuan.spring.jsr250.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
	
	public JSR250WayService() {
		super();
		System.out.println("��ʼ�����캯��-JSR250WayService");
	}
	
	@PostConstruct	//	�ڹ��캯��ִ�����֮��ִ��
	public void init() {
		System.out.println("jsr250-init-method");
	}
	
	@PreDestroy		//	Bean����֮ǰִ��
	public void destory() {
		System.out.println("jsr250-destory-method");
	}
	
}
