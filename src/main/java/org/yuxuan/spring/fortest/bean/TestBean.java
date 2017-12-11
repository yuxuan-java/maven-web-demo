package org.yuxuan.spring.fortest.bean;

import java.io.Serializable;

public class TestBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1217892501574655319L;
	private String context;

	public TestBean(String context) {
		super();
		this.context = context;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}
	
}
