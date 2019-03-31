package com.itheima.crm.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.itheima.crm.dao.LinkmanDao;
import com.itheima.crm.domain.Linkman;

public class LinkmanDaoImpl extends HibernateDaoSupport implements LinkmanDao {

	@Override
	public void add(Linkman linkman) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(linkman);
		
	}

	@Override
	public List<Linkman> list(Linkman linkman) {
		// TODO Auto-generated method stub
		return (List<Linkman>) this.getHibernateTemplate().find("from Linkman");

	}

	@Override
	public void update(Linkman linkman) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().saveOrUpdate(linkman);

	}

	@Override
	public void delete(int id) {
		Object p = this.getHibernateTemplate().get(Linkman.class, id);
		this.getHibernateTemplate().delete(p);
		System.out.println("LinkmanDaoImpl中的delete操作被调用");
	}

}
