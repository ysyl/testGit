package com.web.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
	private long id;
	private User user = new User();
	private String content;
	private Date createTime;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public Comment(User user, String password, Date create_time) {
		super();
		this.user = user;
		this.content = password;
		this.createTime = create_time;
	}
	public Comment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
