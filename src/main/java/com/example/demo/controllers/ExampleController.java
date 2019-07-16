package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("examples")
public class ExampleController {

	private Logger logger = LoggerFactory.getLogger(ExampleController.class);
	
	@Value(value="${DEMO_EXAMPLE_VALUE:value}")
	private String value;
	
	@RequestMapping(method=RequestMethod.GET,value="/value")
	public ExampleResponse open() {
		logger.info("GET /value : {}", value);
		return ExampleResponse.buildRandom(value);
	}
	
}
