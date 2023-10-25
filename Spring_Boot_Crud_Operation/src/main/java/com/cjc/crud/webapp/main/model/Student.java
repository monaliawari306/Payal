package com.cjc.crud.webapp.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student 
{
	@Id
   private int id;
   private String name;
   private long mobno;
   private String username;
   private String password;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getMobno() {
	return mobno;
}
public void setMobno(long mobno) {
	this.mobno = mobno;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", mobno=" + mobno + ", username=" + username + ", password="
			+ password + "]";
}
   
   
}
