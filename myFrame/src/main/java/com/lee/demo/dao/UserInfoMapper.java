package com.lee.demo.dao;

import com.lee.demo.entity.UserInfo;
import com.lee.demo.view.UserInfoDto;

public interface UserInfoMapper {
	public int add(UserInfo user);
	public UserInfoDto getUserInfoByName(String name);
}
