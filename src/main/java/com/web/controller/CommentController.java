package com.web.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Comment;
import com.web.entity.ResultComment;
import com.web.service.CommentService;
import com.web.service.UserService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Resource
	CommentService commentService;
	
	@Resource
	UserService userService;
	
	@GetMapping("/all")
	public List<ResultComment> allComments(Model model) {
		return commentService.findComments();
	}

	@GetMapping("/author")
	public List<ResultComment> findAllCommentsByUserId(@RequestParam("author_id") int uid) {
		return commentService.findComments(uid);
	}
	
	@GetMapping("/reply")
	public List<ResultComment> findAllCommentsByWeiboId(@RequestParam("reply") int wid) {
		return commentService.findAllResultCommentsByWeiboId(wid);
	}
	
	@PostMapping("/post")
	public List<ResultComment> postComment(@RequestBody ResultComment postComment) {
		commentService.save(postComment);
		
		return commentService.findAllResultCommentsByWeiboId(postComment.getId());
	}
}
