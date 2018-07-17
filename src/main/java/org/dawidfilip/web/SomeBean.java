package org.dawidfilip.web;

import org.springframework.stereotype.Service;

@Service
public class SomeBean {
	private String name;

	public SomeBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SomeBean [name=" + name + "]";
	}
	
}
