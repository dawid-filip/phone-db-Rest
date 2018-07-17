package org.dawidfilip.web;

import java.math.BigDecimal;
import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {
	
	private Logger logger = Logger.getLogger(this.getName());
	
	
	@RequestMapping(path = "/bean", method = RequestMethod.GET)
	public SomeBean getSomeBean() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationBeanConfiguration.class); 
		SomeBean someBean = context.getBean("someBean", SomeBean.class);
		someBean.setName("My Bean Test anme");
		return someBean;
	}
	
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public String getName() {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationBeanConfiguration.class); 
		
		PhoneTest pt = new PhoneTest("Sony", "Xperia Z1 Compact", 1999.1, new BigDecimal("2999.99"));
		
		return pt.toString();
	}
	
	@RequestMapping(path = "/value/{type}", method = RequestMethod.GET)
	public String pay(@PathVariable("type") String type) {
		System.out.println("type = " + type);
		logger.info("type = " + type);
		logger.info("type = " + type);
		logger.info("type = " + type);
		return "Your value is: " + type + ", lenght = " + type.length();
	}
}