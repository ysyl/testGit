package com.web.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Comment;
import com.web.entity.ResultComment;
import com.web.mapper.CommentMapper;
import com.web.service.CommentService;

@Service("CommentService")
public class CommentServiceImp implements CommentService {

	@Autowired
	CommentMapper commentMapper;
	
	public long save(Comment comment) {
		// TODO Auto-generated method stub
		commentMapper.insert(comment);
		return comment.getId();
	}

	public List<ResultComment> findComments() {
		// TODO Auto-generated method stub
		return commentMapper.findAll();
	}
	/*根据评论者的用户ID查找评论*/
	public List<ResultComment> findComments(int userId) {
		return commentMapper.findCommentsByUserId(userId);
	}

	public ResultComment findCommentById(int id) {
		// TODO Auto-generated method stub
		return commentMapper.findCommentById(id);
	}
	
	public List<ResultComment> findAllCommentsByWeiboId(int wid) {
		return commentMapper.findAllCommentByWeiboId(wid);
	}

}
