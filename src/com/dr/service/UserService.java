package com.dr.service;

import java.util.List;

import com.dr.bean.User;

public interface UserService {
	    public void doCreatUser(User user);
	    public List<User> findAllUsers();
	    public void delete(User user);
	    public void update(User user);
	    public User findUserById(int id);
}
