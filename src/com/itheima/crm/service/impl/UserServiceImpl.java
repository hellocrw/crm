package com.itheima.crm.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.itheima.crm.dao.UserDao;
import com.itheima.crm.domain.User;
import com.itheima.crm.service.UserService;

@Transactional
public class UserServiceImpl implements UserService {

	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void regist(User user) {
		user.setUser_state("1");
		userDao.save(user);
		
	}

	@Override
	public List<User> login(User user) {
		return (List<User>) userDao.search(user);
	}

}
