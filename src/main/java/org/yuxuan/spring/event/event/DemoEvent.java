package org.yuxuan.spring.event.event;

import org.springframework.context.ApplicationEvent;
/**
 * Spring自定义事件
 *
 * @author yuxuan.han
 */
public class DemoEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1158425815532367355L;
	
	private String msg;
	
	public DemoEvent(Object source, String msg) {
		super(source);
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
