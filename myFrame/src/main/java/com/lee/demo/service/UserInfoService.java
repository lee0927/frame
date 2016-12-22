package com.lee.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lee.demo.dao.UserInfoMapper;
import com.lee.demo.view.UserInfoDto;

@Service
public class UserInfoService {
	@Autowired
	UserInfoMapper userInfoMapper;
	
	public UserInfoDto getUserInfoByName(String userName){
		if(userInfoMapper==null){
			System.out.println("userInfoMapper是空的！！");
		}
		return userInfoMapper.getUserInfoByName(userName);
	}
}
