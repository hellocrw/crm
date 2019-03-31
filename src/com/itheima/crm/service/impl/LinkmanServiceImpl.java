package com.itheima.crm.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.itheima.crm.dao.LinkmanDao;
import com.itheima.crm.domain.Linkman;
import com.itheima.crm.service.LinkmanService;
@Transactional
public class LinkmanServiceImpl implements LinkmanService {
	private LinkmanDao linkmanDao;
	public void setLinkmanDao(LinkmanDao linkmanDao) {
		this.linkmanDao = linkmanDao;
	}

	@Override
	public void add(Linkman linkman) {
		// TODO Auto-generated method stub
		linkmanDao.add(linkman);
	}

	@Override
	public List<Linkman> list(Linkman linkman) {
		// TODO Auto-generated method stub
		return linkmanDao.list(linkman);

	}

	@Override
	public void update(Linkman linkman) {
		// TODO Auto-generated method stub
		linkmanDao.update(linkman);

	}

	@Override
	public void delete(int id) {
		linkmanDao.delete(id);
	}

}
