package com.web.entity;

public class testUser {

	private String username;  
	private String password;  
	private boolean Locked;  

	  public testUser(String username, String password, boolean locked) {  
	        super();  
	        this.username = username;  
	        this.password = password;  
	        Locked = locked;  
	    } 

	  
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isLocked() {
		return Locked;
	}
	public void setLocked(boolean locked) {
		Locked = locked;
	}
}
