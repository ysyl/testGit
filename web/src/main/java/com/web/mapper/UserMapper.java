package com.web.mapper;

import java.util.List;

import com.web.entity.*;

public interface UserMapper {
	List<User> findAll();
	User findUserById(long id);
	int insert(User user);
}
