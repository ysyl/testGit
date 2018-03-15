package com.web.service;

import java.util.List;

import com.web.entity.User;

public interface UserService {
	void save(User user);
	List<User> findAll();
	User findUserById(int id);
}
