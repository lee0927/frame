package com.lee.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("user")
public class UserController {
	
	@RequestMapping("/login.do")
	public String login(){
		System.out.println("登陆页面传递过来的信息！！");
		return "onLogin"; 
	}
	
	@RequestMapping("/userLogin")
	public String userLogin(@RequestParam  String name,@RequestParam String psd,Model model){
		System.out.println(name);
		System.out.println(psd);
		model.addAttribute("userName", name);
		model.addAttribute("password", psd);
		return "loginIn";
	}
}
