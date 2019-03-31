package com.itheima.crm.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.itheima.crm.dao.CustomerDao;
import com.itheima.crm.domain.Customer;
import com.itheima.crm.service.CustomerService;
@Transactional
public class CustomerServiceImpl implements CustomerService {
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	public void add(Customer customer) {
		customerDao.add(customer);
	}

	@Override
//	@Transactional
	public void update(int id,Customer customer) {
		System.out.println("CustomerServiceImpl中的update方法被调用");
		customerDao.update(id, customer);
	}

	@Override
	public List<Customer> list(Customer customer) {
		System.out.println("CustomerServiceImpl中的方法list被调用");
		return customerDao.list(customer);
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		customerDao.delete(id);
	}

}
