package com.web.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
		
		/**
	 * 
	 */
	private static final long serialVersionUID = 2952588243827466661L;
	private int id;
	private String username;
	private String avatar;
	public int getId() {
		return id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
