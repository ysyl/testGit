package com.web.service;

import java.util.List;

import com.web.entity.Comment;
import com.web.entity.ResultComment;

public interface CommentService {
	int save(ResultComment comment);
	List<ResultComment> findComments();
	List<ResultComment> findComments(int userId);
	ResultComment findResultCommentById(int id);
	List<ResultComment> findAllResultCommentsByWeiboId(int wid);
}
