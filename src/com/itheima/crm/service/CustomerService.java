package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.domain.Customer;

public interface CustomerService {
//	�����û���Ϣ
	public void add(Customer customer);
//	�����û���Ϣ
	public void update(int id, Customer customer);
//	��ʾ�û���Ϣ
	public List<Customer> list(Customer customer);
//	ɾ���û���Ϣ
	public void delete(int id);
}
