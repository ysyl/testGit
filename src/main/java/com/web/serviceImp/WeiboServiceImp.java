package com.web.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.Weibo;
import com.web.mapper.WeiboMapper;
import com.web.service.WeiboService;

@Service("WeiboService")
public class WeiboServiceImp implements WeiboService {

	@Autowired
	WeiboMapper weiboMapper;
	
	public List<Weibo> findAllWeibo() {
		// TODO Auto-generated method stub
		return weiboMapper.findAllWeibo();
	}

	public List<Weibo> findAllWeiboByUserId(int uid) {
		// TODO Auto-generated method stub
		return weiboMapper.findAllWeiboByUserId(uid);
	}

}
