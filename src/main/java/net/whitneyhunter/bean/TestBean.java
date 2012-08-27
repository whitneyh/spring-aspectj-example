package net.whitneyhunter.bean;

import net.whitneyhunter.service.Injectable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class TestBean {

	private String value;

	@Autowired
	private Injectable service;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getServiceValue() {
		return service.getServiceValue();
	}

}
