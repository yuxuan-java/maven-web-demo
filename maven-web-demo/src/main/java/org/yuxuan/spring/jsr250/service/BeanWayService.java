package org.yuxuan.spring.jsr250.service;

public class BeanWayService {

	public void init() {
		System.out.println("@Bean-init-method");
	}
	
	public BeanWayService() {
		super();
		System.out.println("��ʼ�����캯��-BeanWayService");
	}
	
	public void destroy() {
		System.out.println("@Bean-destory-method");
	}
	
}
