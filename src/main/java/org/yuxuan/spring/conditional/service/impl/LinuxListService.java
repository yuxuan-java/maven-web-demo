package org.yuxuan.spring.conditional.service.impl;

import org.yuxuan.spring.conditional.service.ListService;

public class LinuxListService implements ListService {

	@Override
	public String showListCmd() {
		return "ls";
	}

}
