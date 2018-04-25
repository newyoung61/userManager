package com.usermanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.usermanager.dao.UserDao;
import com.usermanager.entity.User;


@Service
@Transactional

public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);

	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);

	}

	@Override
	public User getUser(int user_id) {
		return userDao.getUser(user_id);
	}

	@Override
	public void deleteUser(int user_id) {
		userDao.deleteUser(user_id);
	}

	@Override
	public List<User> getUsers() {	
		System.out.println("services");
		return userDao.getUsers();
	}

}
