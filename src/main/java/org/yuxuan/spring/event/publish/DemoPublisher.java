package org.yuxuan.spring.event.publish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.yuxuan.spring.event.event.DemoEvent;
/**
 * ʱ�䷢����
 *
 * @author yuxuan.han
 */
@Component
public class DemoPublisher {
	
	//	ע��ApplicationContext�������¼�
	@Autowired
	ApplicationContext applicationContext;
	
	public void publish(String msg) {
		//	�����¼�
		applicationContext.publishEvent(new DemoEvent(this, msg));
	}

}
