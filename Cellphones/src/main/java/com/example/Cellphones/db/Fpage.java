package com.example.Cellphones.db;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Fpage {
	@Id
	private String username;
	private String newpassword;
	private String confirmpassword;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	

}
