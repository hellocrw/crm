package com.itheima.crm.web.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.itheima.crm.domain.Customer;
import com.itheima.crm.service.CustomerService;

public class CustomerAction {
	private Customer customer;
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
//	新增用户信息
	public String addCustomer(){
		customerService.add(customer);
		return "save";
	}
	
//	显示用户信息
	public String listCustomer() {
		System.out.println("CustomerAction中的listCustomer方法被调用");
		List<Customer> customerList = customerService.list(customer);
		System.out.println("......");
		System.out.println("......");
		System.out.println("......");
		System.out.println(customerList.size());
		for(int i=0;i<customerList.size();i++) {
			customerList.get(i).setI(i+1);
		}
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("customerList", customerList);
		return "customer";
	}
//	删除用户信息
	public String deleteCustomer() {
		System.out.println("come in");
		System.out.println(customer.getId());
		customerService.delete(customer.getId());
		return "delete";
	}
//	修改数据
	public String updateCustomer() {
		System.out.println("CustomerAction中的updateCustomer方法被调用");
		System.out.println("获取需要修改用户信息的Id："+customer.getId());
		customerService.update(customer.getId(),customer);
		return "update";
	}
}
