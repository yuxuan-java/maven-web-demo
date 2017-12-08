package org.yuxuan.spring.conditional.service.impl;

import org.yuxuan.spring.conditional.service.ListService;

public class WindowsListService implements ListService {

	@Override
	public String showListCmd() {
		return "dir";
	}

}
