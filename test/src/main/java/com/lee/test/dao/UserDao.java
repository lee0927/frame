package com.lee.test.dao;

import java.util.List;
import java.util.Map;

import com.lee.test.entity.User;

public interface UserDao {
	public List<User> selectUser(Map<String,Object> map);
}
