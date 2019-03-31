package com.itheima.crm.web.action;

import java.util.List;

import com.itheima.crm.domain.User;
import com.itheima.crm.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private User user;
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String regist(){
		user.setUser_name("hello");
		userService.regist(user);
		return "login";
	}
	
	public String login() {
		List<User> u = (List<User>) userService.login(user);
		if(u.size()>0) {
			return "index";
		}else {
			return "login";
		}
	}
}
