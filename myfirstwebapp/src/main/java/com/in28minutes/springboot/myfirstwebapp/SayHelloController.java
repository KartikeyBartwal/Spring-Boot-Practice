package com.in28minutes.springboot.myfirstwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-name")
	@ResponseBody
	public String sayHello() {
		return "Hello! What are you learning oday ?";
	}
	
	@RequestMapping("say-name-jsp")
	public String sayHellojsp() {
		return "sayHello";
	}
}
