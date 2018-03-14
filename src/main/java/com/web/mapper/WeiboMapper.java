package com.web.mapper;

import java.util.List;

import com.web.entity.Weibo;

public interface WeiboMapper {
	List<Weibo> findAllWeibo();
	List<Weibo> findAllWeiboByUserId(int uid);
}
