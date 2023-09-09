package com.jwt.example.project.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jwt.example.project.entity.User;
@Service
public class UserService {
	private List<User> storeList=new ArrayList<>();
	public UserService() {
		storeList.add(new User("epa234","nikesh","nikesh111@gmail.com"));
		storeList.add(new User("epa923","raushan","raushan111@gmail.com"));
		storeList.add(new User("epa384","rohit","rohit111@gmail.com"));
	}
	public List<User> getUser()
	{
		return this.storeList;
	}
	public User postUser(User user)
	{
		 storeList.add(user);
		 return user;
	}
}
