package org.yuxuan.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yuxuan.spring.ioc.service.FunctionService;
import org.yuxuan.spring.ioc.service.UseFunctionService;
/**
 * @Configuration注解表名当前类是一个配置类，类中可能有0个或者多个@Bean注解
 * 此处没有使用包扫描，是因为所有Bean都在此类中定义了。
 *
 * @author yuxuan.han
 */
@Configuration
public class IocConfig {
	
	/**
	 * @Bean注解声明当前方法functionService的返回值是一个Bean
	 * 	Bean的名称为方法名
	 * @return
	 */
	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}
	
	@Bean
	public UseFunctionService useFunctionService() {
		UseFunctionService useFunctionService = new UseFunctionService();
		useFunctionService.setFunctionService(functionService());
		return useFunctionService;
	}
	
	/**
	 * 另外一种注入的方式，直接将FunctionService作为参数给useFunctionService()方法，这也是Spring容器提供的极好的功能。
	 * 在Spring容器中，主要容器中存在某个Bean，就可以在另外一个Bean的声明方法的参数中注入。
	 */
//	@Bean
//	public UseFunctionService useFunctionService(FunctionService functionService) {
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);
//		return useFunctionService;
//	}
	
}
