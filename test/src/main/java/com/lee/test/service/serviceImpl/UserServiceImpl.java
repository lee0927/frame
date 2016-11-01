package com.lee.test.service.serviceImpl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.lee.test.dao.UserDao;
import com.lee.test.entity.User;
import com.lee.test.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;
	
	public List<User> selectUser(Map<String, Object> map) {
		
		return userDao.selectUser(map);
	}

}
