package com.lee.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("/login")
	public String saveUser(){
		System.out.println("登陆页面传递过来的信息！！");
		return "onLogin"; 
	}
}
