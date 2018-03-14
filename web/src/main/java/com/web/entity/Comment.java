package com.web.entity;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
	private int id;
	private User arthor;
	private String content;
	private Date createAt;
	private Weibo reply;
	
	public int getId() {
		return id;
	}
	public User getArthor() {
		return arthor;
	}
	public void setArthor(User arthor) {
		this.arthor = arthor;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Weibo getReply() {
		return reply;
	}
	public void setReply(Weibo reply) {
		this.reply = reply;
	}
	
	
}
