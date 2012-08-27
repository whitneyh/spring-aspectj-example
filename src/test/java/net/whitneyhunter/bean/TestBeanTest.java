package net.whitneyhunter.bean;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class TestBeanTest {

	@Test
	public void shouldConfigureDomainObject() {
		TestBean bean = new TestBean();
		Assert.assertEquals("Service Value", bean.getValue());
	}

}
