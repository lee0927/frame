package com.lee.test.service;

import java.util.List;
import java.util.Map;

import com.lee.test.entity.User;

public interface UserService {
	public List<User> selectUser(Map<String,Object> map);
}
