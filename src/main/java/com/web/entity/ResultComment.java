package com.web.entity;

import java.io.Serializable;
import java.util.Date;

public class ResultComment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7783402553644881741L;
	private int id;
	private String content;
	private Date createAt;
	private int authorId;
	private String authorName;
	private String authorAvatar;
	private int replyWeiboId;
	private int replyCommentId;
	
	
	public String getauthorAvatar() {
		return authorAvatar;
	}
	public void setauthorAvatar(String authorAvatar) {
		this.authorAvatar = authorAvatar;
	}
	public int getauthorId() {
		return authorId;
	}
	public void setauthorId(int authorId) {
		this.authorId = authorId;
	}
	public int getId() {
		return id;
	}
	public String getauthorName() {
		return authorName;
	}
	public void setauthorName(String authorName) {
		this.authorName = authorName;
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
	public int getReplyWeiboId() {
		return replyWeiboId;
	}
	public void setReplyWeiboId(int replyWeiboId) {
		this.replyWeiboId = replyWeiboId;
	}
	public int getReplyCommentId() {
		return replyCommentId;
	}
	public void setReplyCommentId(int replyCommentId) {
		this.replyCommentId = replyCommentId;
	}
}
