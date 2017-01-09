package com.dr.dao;

import java.util.List;

import com.dr.bean.User;

public interface UserDAO {
    public void doCreatUser(User user);
    public List<User> findAllUsers();
    public void removeUser(User user);
    public void updateUser(User user);
    public User findUserById(int id);
}
