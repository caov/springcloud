package com.van.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@GetMapping("customer")
	public String customer(){
		return "i am customer";
	}
}
