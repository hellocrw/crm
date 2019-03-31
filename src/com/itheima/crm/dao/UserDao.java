package com.itheima.crm.dao;

import java.util.List;

import com.itheima.crm.domain.User;

public interface UserDao {
//	登陆验证
	public List<User> search(User user);
//  新增数据
	public void save(User user);
//  删除数据
	public void delete(User user);
//	修改数据
	public void alter(User user);
//	查看数据
	public List<User> get(int user_id);
}
