package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService{
	 

	List<Contact> list1=List.of(new Contact(1L,"chandan@gmail.com","chandan",1111L),
			new Contact(2L,"mohit@gmail.com","mohit",2222L),
			new Contact(3L,"gaurav@gmail.com","gaurav",3333L)
			);

	@Override
	public List<Contact> getContactOfUser1(Long Userid) {
		return this.list1.stream().filter(contact->contact.getUserid().equals(Userid)).collect(Collectors.toList());
	}
 

	 

	 
	
	 

}
