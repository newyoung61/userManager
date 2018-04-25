package com.usermanager.service;

import java.util.List;

import com.usermanager.entity.User;

public interface UserService {
	
	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(int user_id);
	public void deleteUser(int user_id);
	public List<User> getUsers();
	
}
