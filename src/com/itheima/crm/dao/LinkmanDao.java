package com.itheima.crm.dao;

import java.util.List;

import com.itheima.crm.domain.Linkman;

public interface LinkmanDao {
	public void add(Linkman linkman);
	public List<Linkman> list(Linkman linkman);
	public void update(Linkman linkman);
	public void delete(int id);
}
