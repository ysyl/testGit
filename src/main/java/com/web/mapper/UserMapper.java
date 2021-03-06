package com.web.mapper;

import java.util.List;

import com.web.entity.*;

public interface UserMapper {
	List<User> findAll();
	User findUserById(int id);
	int insert(User user);
	User findUserByUsername(String username);
}
