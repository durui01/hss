package com.dr.dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;  
import com.dr.bean.User;
import com.dr.dao.UserDAO;


public class UserdaoImpl extends HibernateDaoSupport  implements UserDAO{

	@Override
	public void doCreatUser(User user) {
           this.getHibernateTemplate().save(user);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		System.out.println("~~~~~~~findAllUsers~~~~~~~");
		String hql="from User u order by u.id asc";
		List <User> list=this.getHibernateTemplate().find(hql);	
		return list;
	}

	@Override
	public void removeUser(User user) {		
		System.out.println("~~~~~~~removeUser~~~~~~~");

        this.getHibernateTemplate().delete(user);		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("~~~~~~~updateUser~~~~~~~");

    this.getHibernateTemplate().update(user);		
	}

	@Override
	public User findUserById(int id) {
		System.out.println("~~~~~~~findUserById~~~~~~~");
		User user=null;
		user=this.getHibernateTemplate().get(User.class, id);
		return user;
	}
   
}
