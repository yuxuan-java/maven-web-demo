package org.yuxuan.spring.ioc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.yuxuan.spring.ioc.service.FunctionService;
import org.yuxuan.spring.ioc.service.UseFunctionService;
/**
 * @Configurationע�������ǰ����һ�������࣬���п�����0�����߶��@Beanע��
 * �˴�û��ʹ�ð�ɨ�裬����Ϊ����Bean���ڴ����ж����ˡ�
 *
 * @author yuxuan.han
 */
@Configuration
public class IocConfig {
	
	/**
	 * @Beanע��������ǰ����functionService�ķ���ֵ��һ��Bean
	 * 	Bean������Ϊ������
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
	 * ����һ��ע��ķ�ʽ��ֱ�ӽ�FunctionService��Ϊ������useFunctionService()��������Ҳ��Spring�����ṩ�ļ��õĹ��ܡ�
	 * ��Spring�����У���Ҫ�����д���ĳ��Bean���Ϳ���������һ��Bean�����������Ĳ�����ע�롣
	 */
//	@Bean
//	public UseFunctionService useFunctionService(FunctionService functionService) {
//		UseFunctionService useFunctionService = new UseFunctionService();
//		useFunctionService.setFunctionService(functionService);
//		return useFunctionService;
//	}
	
}
