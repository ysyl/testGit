package com.web.mapper;

import java.util.List;

import com.web.entity.Comment;
import com.web.entity.ResultComment;

public interface CommentMapper {
	List<ResultComment> findCommentsByUserId(long id);
	ResultComment findCommentById(long id);
	int insert(Comment comment);
	List<ResultComment> findAll();
	List<ResultComment> findAllCommentByWeiboId(int id);
}
