package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Comment;
import com.web.entity.ResultComment;
import com.web.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController {
	
	@Resource
	CommentService commentService;
	
	@GetMapping("/all")
	public List<ResultComment> allComments(Model model) {
		return commentService.findComments();
	}

	@GetMapping("/arthor")
	public List<ResultComment> findAllCommentsByUserId(@RequestParam("arthor_id") int uid) {
		return commentService.findComments(uid);
	}
	
	@GetMapping("/reply")
	public List<ResultComment> findAllCommentsByWeiboId(@RequestParam("reply") int wid) {
		return commentService.findAllCommentsByWeiboId(wid);
	}
}
