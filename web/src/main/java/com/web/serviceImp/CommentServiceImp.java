package com.web.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Comment;
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

	public List<Comment> findComments() {
		// TODO Auto-generated method stub
		return commentMapper.findAll();
	}
	/*根据评论者的用户ID查找评论*/
	public List<Comment> findComments(long userId) {
		return commentMapper.findCommentsByUserId(userId);
	}

	public Comment findCommentById(Long id) {
		// TODO Auto-generated method stub
		return commentMapper.findCommentById(id);
	}

}
