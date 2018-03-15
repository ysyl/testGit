package com.web.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Comment implements Serializable {
	private int id;
	private User arthor;
	private String content;
	private Date createAt;
	private Weibo replyWeibo;
	private Comment replyComment;
	private List<Comment> ownComments;
	
	public List<Comment> getOwnComments() {
		return ownComments;
	}
	public void setOwnComments(List<Comment> ownComments) {
		this.ownComments = ownComments;
	}
	public Weibo getReplyWeibo() {
		return replyWeibo;
	}
	public void setReplyWeibo(Weibo replyWeibo) {
		this.replyWeibo = replyWeibo;
	}
	public Comment getReplyComment() {
		return replyComment;
	}
	public void setReplyComment(Comment replyComment) {
		this.replyComment = replyComment;
	}
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
	
}
