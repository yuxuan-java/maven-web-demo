package org.yuxuan.spring.aware.service;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
/**
 * Spring-Aware演示Bean
 * 		实现Aware接口后要实现对用的set方法
 *
 * @author yuxuan.han
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
	
	private String beanName;
	private ResourceLoader loader;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loader = resourceLoader;
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
	
	public void outputResult() {
		System.out.println("Bean的名称为: " + beanName);
		
		Resource resource = loader.getResource("classpath:org/yuxuan/spring/aware/test.txt");
		try {
			System.out.println("ResourceLoader加载的文件内容为: " + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
