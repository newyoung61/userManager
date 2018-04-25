package com.usermanager.dao;

import java.util.List;

import javax.management.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.usermanager.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void addUser(User user) {
		getCurrentSession().save(user);

	}

	@Override
	public void updateUser(User user) {
		User userUpdate =getUser(user.getUser_id());
		userUpdate.setUsername(user.getUsername());
		userUpdate.setPassword(user.getPassword());
		userUpdate.setGender(user.getGender());
		userUpdate.setAddress(user.getAddress());
		getCurrentSession().update(userUpdate);
	}

	@Override
	public User getUser(int user_id) {
		User user = (User) getCurrentSession().get(User.class, user_id);
		return user;
	}

	@Override
	public void deleteUser(int user_id) {
		User user =getUser(user_id);
		if(user!=null){
			getCurrentSession().delete(user);
		}	
	}

	@SuppressWarnings("unchecked")
	@Override													
	public List<User> getUsers() {									
		String hsql ="select * from user_manager";
		System.out.println("dao");
		return getCurrentSession().createQuery(hsql).list();
	}

	@Override
	public User getUserByName(String username) {
		User user = (User) getCurrentSession().get(User.class, username);
		return user;
	}

}
