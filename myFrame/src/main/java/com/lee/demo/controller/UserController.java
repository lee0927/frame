package com.lee.demo.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
@Scope("prototype")
public class UserController {
	
	@RequestMapping("/login")
	public String saveUser(){
		System.out.println("登陆页面传递过来的信息！！");
		return "onLogin"; 
	}
}
