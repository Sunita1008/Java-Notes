package com.lkm.acc;

public class Student {

	String name;
	int age;
	int roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Nmae="+name);
		System.out.println("Age="+age);
		System.out.println("Roll="+roll);
	}
	
}