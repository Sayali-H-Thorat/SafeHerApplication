package com.entity;

public class Users {
	
private int userid;
private String username;
private String mobile;
private String city;

public Users()
{
	
}

public Users(int userid, String username, String mobile, String city) {
	super();
	this.userid = userid;
	this.username = username;
	this.mobile = mobile;
	this.city = city;
	
	
	
}

public Users(String username, String mobile, String city) {
	super();
	this.username = username;
	this.mobile = mobile;
	this.city = city;
}

public int getUserid() {
	return userid;
}

public void setUserid(int userid) {
	this.userid = userid;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

@Override
public String toString() {
	return "Users [userid=" + userid + ", username=" + username + ", mobile=" + mobile + ", city=" + city + "]";
}

}




