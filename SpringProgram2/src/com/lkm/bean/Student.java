package com.lkm.bean;

public class Student {

	String name;
	int rollno;
	String email;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Name="+name);
		System.out.println("Email="+email);
		System.out.println("Roll="+rollno);
	}
	
	
}
