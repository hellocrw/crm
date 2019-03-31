package com.itheima.crm.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.crm.dao.UserDao;
import com.itheima.crm.domain.User;
public class UserDaoImpl extends HibernateDaoSupport implements UserDao{
/*	SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/
	@Override
	public List<User> search(User user) {
		List<User> uList = null;
		SessionFactory sessionFactory = this.getHibernateTemplate().getSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		Criteria c = session.createCriteria(User.class);
		Example example = Example.create(user);
		c.add(example);
		uList = c.list();
		return uList;
	}

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alter(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> get(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}

/*public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	@SuppressWarnings("unchecked")
	public List<User> search(User user) {
	List<User> list = (List<User>) getHibernateTemplate().find("from User");
	return list;
	}
	@Override
	// DAO中保存用户的方法
	public void save(User user) {
		this.getHibernateTemplate().save(user);
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		Object p = getHibernateTemplate().load(User.class, user.getUser_id());
		this.getHibernateTemplate().delete(user);
	}

	@Override
	public void alter(User user) {
		  this.getHibernateTemplate().update(user);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> get(int user_id) {
		return (List<User>) this.getHibernateTemplate().get(User.class, user_id);
	}
}*/
