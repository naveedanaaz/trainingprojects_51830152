package com.bankapp.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	

	@GetMapping(path="home")
	public String hello(){
		return "hello to rest";
	}
	
	@GetMapping(path="admin")
	public String admin(){
	 return "hello to admin";	
	}
	
	@GetMapping(path="mgr")
	public String mgr(){
		return "hello to mgr";
	}
		
	@GetMapping(path="clerk")
	public String clerk(){
		return "hello to clerk";
	}
	
}
