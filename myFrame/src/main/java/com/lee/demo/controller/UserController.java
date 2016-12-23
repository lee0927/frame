package com.lee.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.log4j.Logger;

import com.lee.demo.service.UserInfoService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	UserInfoService userInfoService;
	private Logger logger = Logger.getLogger(UserController.class);
	
	@RequestMapping("/login.do")
	public String login(){
		System.out.println("登陆页面传递过来的信息！！");
		return "onLogin"; 
	}
	
	@RequestMapping("/userLogin")
	public String userLogin(@RequestParam  String name,@RequestParam String psd,Model model){
		System.out.println(name);
		System.out.println(psd);
		logger.info("===============================");
		model.addAttribute("userName", userInfoService.getUserInfoByName(name).getName());
		model.addAttribute("password", psd);
		return "loginIn";
	}
}
