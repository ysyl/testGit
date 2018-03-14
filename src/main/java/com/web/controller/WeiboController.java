package com.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.Weibo;
import com.web.service.WeiboService;

@RestController
@RequestMapping("/weibo")
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
