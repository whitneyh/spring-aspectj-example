package net.whitneyhunter.bean;

import net.whitneyhunter.service.Injectable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

/**
 * This bean will be constructed by the new operator; however, it needs to have
 * a service injected by Spring.
 * 
 * The @Configurable annotation calls Spring to try to wire this class.
 */
@Configurable
public class TestBean {

	@Autowired
	private Injectable service;

	public String getValue() {
		return service.getValue();
	}

}
