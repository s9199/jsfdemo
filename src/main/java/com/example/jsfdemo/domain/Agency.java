package com.example.jsfdemo.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Agency {
	private String name;
	private String codeNumber;
	private String phoneNumber;
	private String email;
	
	//@Size (min=6, max=20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	//@Pattern ( regexp="[0-9]{6}")
	public String getCodeNumber() {
		return codeNumber;
	}
	public void setCodeNumber(String codeNumber) {
		this.codeNumber = codeNumber;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
