package com.itheima.crm.web.action;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.itheima.crm.domain.Customer;
import com.itheima.crm.domain.Linkman;
import com.itheima.crm.service.LinkmanService;

public class LinkmanAction{
	private Linkman linkman;
	public Linkman getLinkman() {
		return linkman;
	}
	public void setLinkman(Linkman linkman) {
		this.linkman = linkman;
	}
	
	private LinkmanService linkmanService;
	public void setLinkmanService(LinkmanService linkmanService) {
		this.linkmanService = linkmanService;
	}

	public String addLinkman() {
		linkmanService.add(linkman);
		return "save";
	}
//		System.out.println(customer.getId());
		// TODO Auto-generated method stub
		/*if(linkman.getCust_id()<4) {
			linkmanService.add(linkman);
			return "success";	
		}else
			return "error";
	}*/
	
	public String listLinkman() {
		List<Linkman> linkmanList = linkmanService.list(linkman);
		HttpSession session = ServletActionContext.getRequest().getSession();
		session.setAttribute("linkmanList", linkmanList);
		return "linkman";
	}
	
	public String deleteLinkman(){
		System.out.println(linkman.getId());
		linkmanService.delete(linkman.getId());
		return "delete";
	}
	
	public String updateLinkman(){
		linkmanService.update(linkman);
		return "update";
	}

}
