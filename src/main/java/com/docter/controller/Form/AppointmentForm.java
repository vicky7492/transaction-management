package com.docter.controller.Form;

public class AppointmentForm {

	private String Name;
	private String Gender;
	private String Mobile;
	private int Age;
	public AppointmentForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppointmentForm(String name, String gender, String mobile, int age) {
		super();
		Name = name;
		Gender = gender;
		Mobile = mobile;
		Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "AppointmentForm [Name=" + Name + ", Gender=" + Gender + ", Mobile=" + Mobile + ", Age=" + Age + "]";
	}
	
}
