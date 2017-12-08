package org.yuxuan.spring.profile.bean;

import java.io.Serializable;

public class DemoBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5450494586187559130L;
	
	private String content;

	public DemoBean(String content) {
		super();
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
