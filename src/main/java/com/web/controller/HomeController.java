package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.web.entity.User;
import com.web.mapper.UserMapper;

@Controller
public class HomeController {
	
	@Autowired
	UserMapper userMapper;
	
	@RequestMapping("/home")
	public String home() {
		List<User> zhou = userMapper.selectAll();
		System.out.println(zhou.get(0).getUsername());
		return "index";
	}
}
