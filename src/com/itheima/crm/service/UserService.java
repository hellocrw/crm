package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.domain.User;

public interface UserService {
	public void regist(User user);
	public List<User> login(User user);
}
