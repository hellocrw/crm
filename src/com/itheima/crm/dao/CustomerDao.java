package com.itheima.crm.dao;

import java.util.List;

import com.itheima.crm.domain.Customer;

public interface CustomerDao {
//	��������
	public void add(Customer customer);
//	��ȡ�û�������Ϣ
	public List<Customer> list(Customer customer);
//	�޸�����
	public void update(int id,Customer customer);
//	ɾ���û���Ϣ
	public void delete(int id);

}
