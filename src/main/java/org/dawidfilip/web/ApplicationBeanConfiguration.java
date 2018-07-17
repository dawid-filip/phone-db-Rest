package org.dawidfilip.web;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationBeanConfiguration {
	
	@Bean("someBean")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public SomeBean getSomeBean() {
		return new SomeBean("Some Bean name");
	}
}
