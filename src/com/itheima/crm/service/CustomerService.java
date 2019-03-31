package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.domain.Customer;

public interface CustomerService {
//	新增用户信息
	public void add(Customer customer);
//	更新用户信息
	public void update(int id, Customer customer);
//	显示用户信息
	public List<Customer> list(Customer customer);
//	删除用户信息
	public void delete(int id);
}
