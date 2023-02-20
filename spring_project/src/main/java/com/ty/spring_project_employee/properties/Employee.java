package com.ty.spring_project_employee.properties;

public class Employee {
	
	String name;
	int age;
	String address;
	

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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public void print() {
		System.out.println(" name : "+ name +"\n age : "+ age + "\n address : "+address);
	}
}
