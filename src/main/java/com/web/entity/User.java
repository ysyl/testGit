package com.web.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
		
		private int id;
		public int getId() {
			return id;
		}
		private String username;
		private String password;
		private Date createTime;
		private List<Comment> comments;
		
		public List<Comment> getComments() {
			return comments;
		}

		public void setComments(List<Comment> comments) {
			this.comments = comments;
		}

		
		public User() {
			super();
			// TODO Auto-generated constructor stub
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

		public Date getCreateDate() {
			return createTime;
		}

		public void setCreateDate(Date createDate) {
			this.createTime = createDate;
		}
		
		
}
