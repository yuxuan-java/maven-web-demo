//package org.yuxuan.spring.taskscheduled.service;
//
//import org.joda.time.DateTime;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Service;
///**
// * ͨ��@Scheduledע�����������Ǽƻ�����
// */
//@Service
//public class TaskScheduledService {
//	
//	private static final String pattern = "HH:mm:ss";
//	
//	/**
//	 * ʹ��fixedRate����ÿ���̶�ʱ��ִ��
//	 */
//	@Scheduled(fixedRate = 5000)
//	public void reportCurrentTime() {
//		System.out.println("reportCurrentTime: " + new DateTime().toString(pattern));
//	}
//	
//	/**
//	 * ʹ��cron���Կ��԰���cron���ʽָ����ʱ��ִ��
//	 */
//	@Scheduled(cron = "*/10 * * * * ?")
//	public void fixTimeExecution() {
//		System.out.println("fixTimeExecution: " + new DateTime().toString(pattern));
//	}
//	
//}
