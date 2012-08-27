package net.whitneyhunter.bean;

import net.whitneyhunter.service.Injectable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class TestBean {

	@Autowired
	private Injectable service;

	public String getValue() {
		return service.getValue();
	}

}
