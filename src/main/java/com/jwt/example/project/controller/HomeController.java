package com.jwt.example.project.controller;

import java.security.Principal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.project.entity.User;
import com.jwt.example.project.service.UserService;

//import jakarta.security.auth.message.AuthStatus;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
 UserService userservice;
@GetMapping("/user")
 public List<User> getuser()
 {
	return this.userservice.getUser();
 }
@PostMapping("/own")
public User posUser(@RequestBody User user)
{
	return this.userservice.postUser(user);
}
 @GetMapping("current-user")
 public String getLoggedUser(Principal principal)
 {
	 return principal.getName();
 }
}
