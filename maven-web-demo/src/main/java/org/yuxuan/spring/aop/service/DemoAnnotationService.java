package org.yuxuan.spring.aop.service;

import org.springframework.stereotype.Service;
import org.yuxuan.spring.aop.annotation.Action;

/**
 * ����ע��ı�������
 *
 * @author yuxuan.han
 */
@Service
public class DemoAnnotationService {
	
	@Action(name = "ע��ʽ���ص�add����")
	public void add(){
		System.out.println("org.yuxuan.spring.aop.service.DemoAnnotationService.add()");
	}
	
}
