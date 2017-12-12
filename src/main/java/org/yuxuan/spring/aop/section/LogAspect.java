package org.yuxuan.spring.aop.section;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
import org.yuxuan.spring.aop.annotation.Action;

@Aspect		//	��������һ������
@Component	//	����Ҳ��һ��Spring���������Bean
public class LogAspect {
	
	/**
	 * �����е�
	 */
	@Pointcut("@annotation(org.yuxuan.spring.aop.annotation.Action)")
	public void annotationPointCut(){}
	
	/**
	 * ����һ�����ԣ�ʹ��@Pointcut������е�
	 * @param joinPoint
	 */
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		//	ͨ������Ի��ע���ϵ����ԣ�Ȼ������־��صĲ���
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("Afterע��ʽ����: " + action.name());
	}

	/**
	 * ����һ�����ԣ�ֱ��ʹ�����ع�����Ϊ����
	 * @param joinPoint
	 */
	@Before("execution(* org.yuxuan.spring.aop.service.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		//	��ȡ������
		System.out.println("Before��������ʽ����: " + method.getName());
	}
	
}
