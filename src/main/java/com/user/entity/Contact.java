package com.user.entity;

public class Contact {
   private Long contactid;
   private String contactemail;
   private String contactname;
   private Long userid;
public Contact(Long contactid, String contactemail, String contactname, Long userid) {
	super();
	this.contactid = contactid;
	this.contactemail = contactemail;
	this.contactname = contactname;
	this.userid = userid;
}
public Contact() {
	 
}
public Long getContactid() {
	return contactid;
}
public void setContactid(Long contactid) {
	this.contactid = contactid;
}
public String getContactemail() {
	return contactemail;
}
public void setContactemail(String contactemail) {
	this.contactemail = contactemail;
}
public String getContactname() {
	return contactname;
}
public void setContactname(String contactname) {
	this.contactname = contactname;
}
public Long getUserid() {
	return userid;
}
public void setUserid(Long userid) {
	this.userid = userid;
}
   
}
