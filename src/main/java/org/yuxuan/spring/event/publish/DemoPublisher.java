package org.yuxuan.spring.event.publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.yuxuan.spring.event.event.DemoEvent;
/**
 * 时间发布类
 *
 * @author yuxuan.han
 */
@Component
public class DemoPublisher {
	
	//	注入ApplicationContext来发布事件
	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg) {
		//	发布事件
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}

}
