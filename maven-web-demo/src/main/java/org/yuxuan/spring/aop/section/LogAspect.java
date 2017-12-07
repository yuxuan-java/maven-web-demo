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

@Aspect		//	声明这是一个切面
@Component	//	声明也是一个Spring容器管理的Bean
public class LogAspect {
	
	/**
	 * 声明切点
	 */
	@Pointcut("@annotation(org.yuxuan.spring.aop.annotation.Action)")
	public void annotationPointCut(){}
	
	/**
	 * 声明一个建言，使用@Pointcut定义的切点
	 * @param joinPoint
	 */
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint) {
		//	通过反射可以获得注解上的属性，然后做日志相关的操作
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		System.out.println("After注解式拦截: " + action.name());
	}

	/**
	 * 声明一个建言，直接使用拦截规则作为参数
	 * @param joinPoint
	 */
	@Before("execution(* org.yuxuan.spring.aop.service.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		//	获取方法名
		System.out.println("Before方法规则式拦截: " + method.getName());
	}
	
}
