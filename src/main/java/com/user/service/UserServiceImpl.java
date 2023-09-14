package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImpl implements UserService  {
    // fake user list
	List<User> list=List.of(new User(1111L,"chandan singh","2838362462"),
			new User(2222L,"gunjan singh","283893845"),
			new User(3333L,"arpan singh","394462462"));

	public User getUser(Long userid) {
		return this.list.stream().filter(user->user.getUserid().equals(userid)).findAny().orElse(null);
	}

	 

	 
}
