package org.yuxuan.spring.ioc.service;

public class UseFunctionService {
	
	FunctionService functionService;

	public void setFunctionService(FunctionService functionService) {
		this.functionService = functionService;
	}
	
	public String useSayHello(String word) {
		return functionService.sayHello(word);
	}
	
}
