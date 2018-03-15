package com.web.service;

import java.util.List;

import com.web.entity.Comment;
import com.web.entity.ResultComment;

public interface CommentService {
	long save(Comment comment);
	List<ResultComment> findComments();
	List<ResultComment> findComments(int userId);
	ResultComment findCommentById(int id);
	List<ResultComment> findAllCommentsByWeiboId(int wid);
}
