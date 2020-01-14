package com.pancm.pojo;

/**
 * 
* Title: User
* Description:用户pojo类
* Version:1.0.0  
* @author pancm
* @date 2017年9月26日
 */
public class User {
	
	 /** 编号 */
	 private int id;
	 /** 姓名 */
	 private String name;
	 /** */
	 private int order;
	 /** 年龄 */
	 private int age;
	 
	 private String department;
	 
	 private String sex;
	 
	 private String title;
	 
	 private String votes;

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

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVotes() {
		return votes;
	}

	public void setVotes(String votes) {
		this.votes = votes;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, int order, int age, String department, String sex, String title, String votes) {
		super();
		this.id = id;
		this.name = name;
		this.order = order;
		this.age = age;
		this.department = department;
		this.sex = sex;
		this.title = title;
		this.votes = votes;
	}

	
	

}
