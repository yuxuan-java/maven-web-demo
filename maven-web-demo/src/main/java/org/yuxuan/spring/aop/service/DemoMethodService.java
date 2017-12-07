package org.yuxuan.spring.aop.service;

import org.springframework.stereotype.Service;
/**
 * 使用方法规则被拦截类
 *
 * @author yuxuan.han
 */
@Service
public class DemoMethodService {
	
	public void add(){
		System.out.println("org.yuxuan.spring.aop.service.DemoMethodService.add()");
	}
	
}
