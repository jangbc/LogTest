package net.smartworks.log.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.MongoException;

import net.smartworks.log.service.LoggerService;

@RestController
public class LogTestController {

	@Autowired
	LoggerService loggerService;

	@RequestMapping(value = "/log/test", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String logTest() {
		loggerService.printLogHelloWorld();
		return "Log Test";

	}
	
	@RequestMapping(value = "/log/test2", method = RequestMethod.GET)
	@ResponseStatus(value = HttpStatus.OK)
	public String logTest2() {
		loggerService.printLogHelloWorld2();
		return "Log Test";

	}
}