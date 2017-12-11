package org.yuxuan.spring.fortest.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.yuxuan.spring.fortest.bean.TestBean;
import org.yuxuan.spring.fortest.config.TestConfig;

//	SpringJunit4ClassRunner在Junit环境下提供SpringTestContextFramework的功能
@RunWith(SpringJUnit4ClassRunner.class)
//	@ContextConfiguration用来加载配置ApplicationContext,class属性用来加载配置类
@ContextConfiguration(classes = {TestConfig.class})
//	@ActiveProfiles用来声明活动的profile
@ActiveProfiles("dev")
public class DemoBeanIntegrationTests {
	
	//	可以使用普通的@Autowired注入Bean
	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject() {
		String expeted = "from production profile";
		String actual = testBean.getContext();
		//	使用断言来校验结果是否和预期一致
		Assert.assertEquals(expeted, actual);
	}
	
}
