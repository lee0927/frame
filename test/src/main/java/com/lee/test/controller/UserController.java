package com.lee.test.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lee.test.entity.User;
import com.lee.test.service.UserService;


@Controller
@RequestMapping("/userinfo")
public class UserController {
	
	@Resource
	private UserService us;
	
	@RequestMapping(value="/{id}")
	@ResponseBody
	public List<User> test(@PathVariable Long id,HttpServletRequest request,HttpServletResponse respone){
		
		System.out.println(id);
		
		Map<String, Object> paramMap = new HashMap<String,Object>();
		
		paramMap.put("user_id",id);
		List<User> list = us.selectUser(paramMap);
		
		for(User u : list){
			System.out.println(u.getUser_name());
		}
		
		return list;
	}
	
	
	public void prsasdintLine1(){
		
	}
}
