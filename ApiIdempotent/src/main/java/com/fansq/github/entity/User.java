package com.fansq.github.entity;

public class User {

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}
	private String name;
	public User() {
	}
	private int age;
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
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
