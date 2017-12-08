package org.yuxuan.spring.event.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.yuxuan.spring.event.event.DemoEvent;
/**
 * 事件监听器
 *		实现ApplicationListener接口，指定监听的时间类型
 * @author yuxuan.han
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	/**
	 * 重写方法对消息进行处理
	 */
	@Override
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("demoListener接受到了demoPublisher发布的消息: " + msg);
	}

}
