package com.user.controller;

 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.UserService;
 

@RestController
@RequestMapping("/user")
public class UsetController {
    @Autowired
	private UserService userservice;
	@Autowired
	private RestTemplate resttemplate;
    
	@GetMapping("/{userid}")
	public User getUser(@PathVariable("userid")Long userid)
	{
	//return	this.userservice.getUser(userid);
		User user=this.userservice.getUser(userid);
		List contacts=this.resttemplate.getForObject("http://CONTACT-SERVICE/contact/user/"+user.getUserid(), List.class);
	     user.setContact(contacts);
		return user;
	}
}
