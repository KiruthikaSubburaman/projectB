package com.chainsys.application.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class Service {
	@RequestMapping("welcome")
	public String welcomePage() {
		return "<h1>welcome</h1>";
	}
	@RequestMapping("/home")
public String homePage()
{
	String html="<div>There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.</div>";
	return html;
}
	
	@RequestMapping("/getdata")
	public String getData(@RequestParam(value="city",defaultValue="madurai")String city){
	
		return "<h1>welcome to "+city+"</h1>";
		
	}
}

