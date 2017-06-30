package com.van.ribbon.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.van.ribbon.domain.User;

@EnableEurekaClient
@RestController
public class RibbonController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/provider/{id}")
	public User findById(@PathVariable Long id){
		return this.restTemplate.getForObject("http://provider/" + id, User.class);
	}
}
