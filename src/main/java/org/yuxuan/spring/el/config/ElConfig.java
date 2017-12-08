package org.yuxuan.spring.el.config;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("org.yuxuan.spring.el")
@PropertySource("classpath:org/yuxuan/spring/el/test.properties")
public class ElConfig {
	
	@Value("I Love You!")
	private String normal;
	
	//	ע�����ϵͳ����
	@Value("#{systemProperties['os.name']}")
	private String osName;
	
	//	ע����ʽ���
	@Value("#{ T(java.lang.Math).random() * 100.0 }")
	private double randomNumber;
	
	//	ע������Bean����
	@Value("#{demoService.author}")
	private String fromAnother;
	
	//	ע���ļ���Դ
	@Value("classpath:org/yuxuan/spring/el/test.txt")
	private Resource testFile;
	
	//	ע����ַ��Դ
	@Value("http://www.baidu.com")
	private Resource testUrl;
	
	//	ע�������ļ�
	@Value("${book.name}")
	private String bookName;

	@Autowired
	private Environment environment;
	
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
