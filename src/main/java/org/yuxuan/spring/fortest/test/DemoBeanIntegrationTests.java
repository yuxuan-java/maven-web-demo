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

//	SpringJunit4ClassRunner��Junit�������ṩSpringTestContextFramework�Ĺ���
@RunWith(SpringJUnit4ClassRunner.class)
//	@ContextConfiguration������������ApplicationContext,class������������������
@ContextConfiguration(classes = {TestConfig.class})
//	@ActiveProfiles�����������profile
@ActiveProfiles("dev")
public class DemoBeanIntegrationTests {
	
	//	����ʹ����ͨ��@Autowiredע��Bean
	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject() {
		String expeted = "from production profile";
		String actual = testBean.getContext();
		//	ʹ�ö�����У�����Ƿ��Ԥ��һ��
		Assert.assertEquals(expeted, actual);
	}
	
}
