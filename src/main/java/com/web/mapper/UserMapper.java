package com.web.mapper;

import java.util.List;

import com.web.entity.*;

public interface UserMapper {
	List<User> selectAll();
	User selectUserById();
	int insert(User user);
}
