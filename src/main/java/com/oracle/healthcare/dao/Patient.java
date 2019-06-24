package com.oracle.healthcare.dao;

public class Patient {

	private String name;
	private int age;
	private String adress;
	private String email;
	
	
	public Patient() {
		super();
		
	}
	public Patient(String name, int age, String adress, String email) {
		super();
		this.name = name;
		this.age = age;
		this.adress = adress;
		this.email = email;
	}
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
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", adress=" + adress + ", email=" + email + "]";
	}
	
}
