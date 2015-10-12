package com.spring.saishang.manager;

import java.util.Arrays;

import org.springframework.stereotype.Service;

import com.spring.saishang.bean.User;

@Service
public class UserManager {

	public String aaa(){
		System.out.println("aaa");
		return null;
	}
	
	public User getUser(String userName){
		User user=new User();
		user.setUserName("saishang");
//		user.setPassword("202cb962ac59075b964b07152d234b70"); //123,null
//		user.setPassword("1ee21fff6208ea4aae8d7f52e6f5d06d"); //123,name
		user.setPassword("765cf51c0ea121392ec246e0c66ba767"); //123,username
		user.setAuthorityList(Arrays.asList("ss","dd"));
		return user;
	}
}
