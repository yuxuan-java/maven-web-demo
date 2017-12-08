package org.yuxuan.spring.conditional2.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void outputResult() {
		System.out.println("从组合注解配置获得的Bean!");
	}
	
}
