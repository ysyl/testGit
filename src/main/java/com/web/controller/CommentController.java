package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Comment;
import com.web.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Resource
	CommentService commentService;
	
	@GetMapping("/all")
	public List<Comment> allComments(Model model) {
		return commentService.findComments();
	}
	
	@GetMapping("/all/user_id={user_id}")
	public List<Comment> findAllCommentsByUserId(@RequestParam("user_id") long userId) {
		return commentService.findComments(userId);
	}
}
