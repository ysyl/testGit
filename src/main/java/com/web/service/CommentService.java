package com.web.service;

import java.util.List;

import com.web.entity.Comment;

public interface CommentService {
	long save(Comment comment);
	List<Comment> findComments();
	List<Comment> findComments(long userId);
	Comment findCommentById(Long id);
}
