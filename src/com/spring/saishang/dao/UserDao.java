package com.spring.saishang.dao;

import org.springframework.stereotype.Repository;

import com.spring.saishang.bean.User;

@Repository
public interface UserDao {

	public User getUser(long id);
}
