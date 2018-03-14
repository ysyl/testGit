package com.web.service;

import java.util.List;

import com.web.entity.Weibo;

public interface WeiboService {
	List<Weibo> findAllWeibo();
	List<Weibo> findAllWeiboByUserId(int uid);
}
