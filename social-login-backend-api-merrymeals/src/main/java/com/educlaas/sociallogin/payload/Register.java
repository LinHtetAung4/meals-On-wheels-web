package com.educlaas.sociallogin.payload;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class Register {
	
	@NotBlank
	private String userName;
	
	@Email
	@NotBlank
	private String email; 
	
	@NotBlank
	private String password;
	
	
	@NotBlank
	private String type;
	
	
	@NotBlank
	private String gender;
	
	@NotBlank
	private int age;
	
	@NotBlank
	private String address;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
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
	
	
	
}
