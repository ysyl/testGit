package com.web.controller;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.entity.Comment;
import com.web.entity.User;
import com.web.mapper.CommentMapper;
import com.web.mapper.UserMapper;
import com.web.service.CommentService;
import com.web.service.UserService;

import web.CommentServiceTest;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	CommentService commentService;
	
	private static Logger log = Logger.getLogger(HomeController.class);
	
	@RequestMapping("/")
	public String home() {
		System.out.println("index");
		return "index";
	}
}
