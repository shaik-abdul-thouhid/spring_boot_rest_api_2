package com.learn_spring.rest_api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/another_test")
class DemoRestController2 {

	@GetMapping("/hello")
	public String sayHello() {
		return "I will say something different!";
	}
	
}

@RestController
@RequestMapping("/test")
public class DemoRestController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World!!!";
	}

}
