package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

<<<<<<< HEAD
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
=======
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> origin/dev
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Weibo;
import com.web.service.WeiboService;

@RestController

@RequestMapping(value="/weibo", method=RequestMethod.GET)
public class WeiboController {

	@Resource
	WeiboService weiboService;
	
	@GetMapping("/all")
	public List<Weibo> findAllWeibo() {
		return weiboService.findAllWeibo();
	}
	
	@GetMapping("/all/{uid}")
	public List<Weibo> findAllWeiboByUserId(@RequestParam("uid") int uid) {
		return weiboService.findAllWeiboByUserId(uid);
	}
}
