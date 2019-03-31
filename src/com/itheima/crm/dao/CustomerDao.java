package com.itheima.crm.dao;

import java.util.List;

import com.itheima.crm.domain.Customer;

public interface CustomerDao {
//	新增数据
	public void add(Customer customer);
//	获取用户数据信息
	public List<Customer> list(Customer customer);
//	修改数据
	public void update(int id,Customer customer);
//	删除用户信息
	public void delete(int id);

}
