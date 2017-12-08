package org.yuxuan.spring.taskexecutor.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {

	/**
	 * ʹ��@Aysncע������÷����Ǹ��첽����
	 * 		���ע�����༶��������������еķ��������첽����
	 * 		����ķ����Զ���ע��ʹ��ThreadPoolTaskExecutor��ΪTaskExecutor��
	 * !!!ע�⣺
	 * 		�˴�pom.xml�ļ���Spring-context��Spring-aop�����ð汾Ӧ����һ�£�
	 * 		������ܳ���ClassNotFound:AbstractBeanFactoryAwareAdvisingPostProcessor����
	 * @param i
	 */
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("ִ���첽����: " + i);
	}
	
	@Async
	public void executeAsyncTaskPuls(Integer i) {
		System.out.println("ִ���첽����+1: " + (i + 1));
	}
	
}
