package com.web.mapper;

import java.util.List;

import com.web.entity.Comment;
import com.web.entity.ResultComment;

public interface CommentMapper {
	List<ResultComment> findCommentsByUserId(long id);
	ResultComment findResultCommentById(long id);
	int insert(ResultComment comment);
	List<ResultComment> findAll();
	List<ResultComment> findAllResultCommentByWeiboId(int id);
	List<Comment> findCommentById(int id);
}
