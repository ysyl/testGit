package com.web.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.User;
import com.web.mapper.UserMapper;
import com.web.service.UserService;

@Service("UserService")
public class UserServiceImp implements UserService {

	@Autowired
	UserMapper userMapper;
	
	public void save(User user) {
		// TODO Auto-generated method stub
		userMapper.insert(user);
		
	}

	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userMapper.findAll();
	}

	public User findUserById(Long id) {
		// TODO Auto-generated method stub
		return userMapper.findUserById(id);
	}

}
