package org.yuxuan.spring.event.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.yuxuan.spring.event.event.DemoEvent;
/**
 * �¼�������
 *		ʵ��ApplicationListener�ӿڣ�ָ��������ʱ������
 * @author yuxuan.han
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	/**
	 * ��д��������Ϣ���д���
	 */
	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("demoListener���ܵ���demoPublisher��������Ϣ: " + msg);
	}

}
