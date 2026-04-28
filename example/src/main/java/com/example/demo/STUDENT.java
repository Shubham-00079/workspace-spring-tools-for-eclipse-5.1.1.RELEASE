package com.example.demo;

import java.util.Objects;

import org.springframework.stereotype.Component;
@Component

public class STUDENT {
	int roll;
	String name;

	
public STUDENT() {
	// TODO Auto-generated constructor stub
}


public STUDENT(int roll, String name) {
	super();
	this.roll = roll;
	this.name = name;
}


public int getRoll() {
	return roll;
}


public void setRoll(int roll) {
	this.roll = roll;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "STUDENT [roll=" + roll + ", name=" + name + "]";
}


@Override
public int hashCode() {
	return Objects.hash(name, roll);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	STUDENT other = (STUDENT) obj;
	return Objects.equals(name, other.name) && roll == other.roll;
}


}
