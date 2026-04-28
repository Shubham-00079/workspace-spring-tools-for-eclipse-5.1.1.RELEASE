package com.example.demo.Entity;

public class User {
int id;
String name;
String password;
Role role;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int id, String name, String password, Role role) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.role = role;
}
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Role getRole() {
	return role;
}
public void setRole(Role role) {
	this.role = role;
}


}
