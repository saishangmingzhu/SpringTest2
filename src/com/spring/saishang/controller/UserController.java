package com.spring.saishang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.saishang.manager.UserManager;

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private UserManager userManager;
	
	@RequestMapping("/aaa")
	public String aaa(){
		userManager.aaa();
		System.out.println("ssss");
		return null;
	}
	
	@RequestMapping("login")
	public String login(Model model){
		return "loginPage";
	}
	
	@RequestMapping("loginSuccess")
	public String loginSuccess(Model model){
		return "loginSuccessPage";
	}
	
	@RequestMapping("admin")
	public String admin(){
		return "adminPage";
	}
	
	@RequestMapping("logout")
	public String logout(){
		return "logoutPage";
	}
	
	@RequestMapping("loginFalse")
	public String loginFalse(){
		return "loginFalse";
	}
}


