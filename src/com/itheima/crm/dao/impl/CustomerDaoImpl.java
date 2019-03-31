package com.itheima.crm.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.itheima.crm.dao.CustomerDao;
import com.itheima.crm.domain.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {
	Customer customer;
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public void add(Customer customer) {
		this.getHibernateTemplate().save(customer);
//		this.getHibernateTemplate().saveOrUpdate(customer);
	}

	@Override
	public List<Customer> list(Customer customer) {
		System.out.println("CustomerDaoImpl�еķ���list������");
		@SuppressWarnings("unchecked")
		List<Customer> list = (List<Customer>) this.getHibernateTemplate().find("from Customer");
		System.out.println("Dao������ݵ��óɹ�");
//		System.out.println(list.get(1));
		return list;
		/*List<Customer> list = (List<Customer>) this.getHibernateTemplate().get(Customer.class, 1);
		System.out.println(list.size());
		System.out.println("............................");
		return list;*/
	}

	@Override
	public void update(int id,Customer customer) {
		System.out.println("CustomerDaoImpl��update����������,idΪ��"+id);
//		getHibernateTemplate().flush();
//		Object p = getHibernateTemplate().get(Customer.class, id);
		getHibernateTemplate().saveOrUpdate(customer);
		System.out.println("���ݸ��³ɹ�");
	}

	@Override
	public void delete(int id) {
		System.out.println("�����idΪ"+id);
		Object p = getHibernateTemplate().get(Customer.class, id);
		getHibernateTemplate().delete(p);
	}
}
