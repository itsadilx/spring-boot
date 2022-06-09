package com.tnsif.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	//localhost:8080/hello
	
     @GetMapping ("/hello")
	public String helloWorld()
	{
		return "Hello Welcome to Rest API";
	}
	
}
