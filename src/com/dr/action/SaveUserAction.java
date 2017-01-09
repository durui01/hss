package com.dr.action;

import java.util.Map;

import org.apache.catalina.connector.Request;

import com.dr.bean.User;
import com.dr.service.UserService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SaveUserAction extends ActionSupport{
     private User user;
     private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	public String doCreatUser(){
		//����service��ط��������ʵ��ҵ��
		this.userService.doCreatUser(user);
		//return "success";
		return SUCCESS;
		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
    public String findAllUsers() {
		//����service��ط��������ʵ��ҵ��
		System.out.println("~~~~~~~���뵽findAllUsers.action~~~~~~");
		Map request=(Map) ActionContext.getContext().get("request");
		request.put("list",this.userService.findAllUsers());
		return SUCCESS;
	}
     
    	public String delete(){
		//����service��ط��������ʵ��ҵ��
    	System.out.println("~~~~~~~���뵽findAllUsers~~~~~~");

		this.userService.delete(user);
		return SUCCESS;
	}
	
    	public String update(){
    		//����service��ط��������ʵ��ҵ��
    		System.out.println("~~~~~~~���뵽findAllUsers~~~~~~");

    		this.userService.update(user);
    		
    		return "update";
    	}
    	
    	
		public String findUserById(){
    		//����service��ط��������ʵ��ҵ��
    		System.out.println("~~~~~~~���뵽findAllUsers~~~~~~");
            this.user= this.userService.findUserById(user.getId());
    		
    		return "update";
    	}
    
	
}
