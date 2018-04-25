package com.usermanager.service;

import java.util.List;

import com.usermanager.entity.User;

public interface IUserService {
	void save(User user);
	User findById(int id);
	List<User> find();
}
