package com.spring.saishang.service;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.spring.saishang.bean.User;
import com.spring.saishang.manager.UserManager;

public class CustomUserService implements UserDetailsService{

	@Autowired
	private UserManager userManager;
	
	@Override
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		User user = userManager.getUser(userName);
		
		if (user == null){
			throw new UsernameNotFoundException("用户"+userName+"不存在");
		}
		
		HashSet<GrantedAuthority> grantedAuthoritySet = getUserAuthority(user);
		
		boolean enabled = true;
		boolean accountNonExpired = true;
		boolean credentialsNonExpired = true;
		boolean accountNonLocked = true;
		
		UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUserName(), 
				user.getPassword(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuthoritySet);
		System.out.println(userDetails.getPassword());
		return userDetails;
	}
	
	private HashSet<GrantedAuthority> getUserAuthority(User user) {
		HashSet<GrantedAuthority> grantedAuthoritySet = new HashSet<GrantedAuthority>();
		for (String grantedAuthority:user.getAuthorityList()){
			grantedAuthoritySet.add(new GrantedAuthorityImpl(grantedAuthority));
		}
		return grantedAuthoritySet;
	}
	
	public static void main(String[] args) {
		Md5PasswordEncoder md5=new Md5PasswordEncoder();
		String passwordString=md5.encodePassword("123", "username");
		System.out.println(passwordString);
		boolean b=md5.isPasswordValid("1ee21fff6208ea4aae8d7f52e6f5d06d", "123", "name");
		System.out.println(b);
	}

}
