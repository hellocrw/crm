package com.itheima.crm.service;

import java.util.List;

import com.itheima.crm.domain.Linkman;

public interface LinkmanService {
	public void add(Linkman linkman);
	public void update(Linkman linkman);
	public List<Linkman> list(Linkman linkman);
	public void delete(int id);
}
