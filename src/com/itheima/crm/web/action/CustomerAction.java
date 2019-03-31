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
//	�����û���Ϣ
	public String addCustomer(){
		customerService.add(customer);
		return "save";
	}
	
//	��ʾ�û���Ϣ
	public String listCustomer() {
		System.out.println("CustomerAction�е�listCustomer����������");
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
//	ɾ���û���Ϣ
	public String deleteCustomer() {
		System.out.println("come in");
		System.out.println(customer.getId());
		customerService.delete(customer.getId());
		return "delete";
	}
//	�޸�����
	public String updateCustomer() {
		System.out.println("CustomerAction�е�updateCustomer����������");
		System.out.println("��ȡ��Ҫ�޸��û���Ϣ��Id��"+customer.getId());
		customerService.update(customer.getId(),customer);
		return "update";
	}
}
