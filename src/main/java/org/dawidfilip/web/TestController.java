package org.dawidfilip.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.istack.internal.logging.Logger;

@RestController
@RequestMapping("/test")
public class TestController {
	
	Logger logger = Logger.getLogger(TestController.class);
	
	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public String getName() {
		return "Example of method";
	}
	
	@RequestMapping(path = "/value/{number}", method = RequestMethod.GET)
	public String pay(@PathVariable("number") String number) {
		System.out.println("number = " + number);
		logger.info("number = " + number);
		logger.info("number = " + number);
		logger.info("number = " + number);
		return "Your value is: " + number + ", lenght = " + number.length();
	}
}