package com.dr.service.impl;

import java.util.List;

import com.dr.bean.User;
import com.dr.dao.UserDAO;
import com.dr.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDAO dao;
  
	public UserDAO getDao() {
		return dao;
	}

	public void setDao(UserDAO dao) {
		this.dao = dao;
	}

	@Override
	public void doCreatUser(User user) {
		// TODO Auto-generated method stub
		this.dao.doCreatUser(user);

	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return this.dao.findAllUsers();
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
     this.dao.removeUser(user);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
       this.dao.updateUser(user);
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return this.dao.findUserById(id);
	}

}
