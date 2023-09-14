package com.user.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
     private Long userid;
     private String name;
     private String phone;
     
     List<Contact> contact=new ArrayList<>();

	public User(Long userid, String name, String phone, List contact) {
	 
		this.userid = userid;
		this.name = name;
		this.phone = phone;
		this.contact = contact;
	}





	public User(Long userid, String name, String phone) {
		 
		this.userid = userid;
		this.name = name;
		this.phone = phone;
	}

	 

	 

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContact() {
		return contact;
	}





	public void setContact(List<Contact> contact) {
		this.contact = contact;
	}


	 
     
}
