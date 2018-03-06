package com.web.mapper;

import java.util.List;

import com.web.entity.Comment;

public interface CommentMapper {
	List<Comment> findCommentsByUserId(long id);
	Comment findCommentById(long id);
	long insert(Comment comment);
	List<Comment> findAll();
}
