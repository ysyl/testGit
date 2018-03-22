package com.web.entity;

import java.io.Serializable;
import java.util.Date;

public class Weibo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5663877660433378607L;
	private int id;
	private String content;
	private User author;
	private Date createAt;
	private String image;
	
	public int getId() {
		return id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public User getauthor() {
		return author;
	}
	public void setauthor(User author) {
		this.author = author;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
}
