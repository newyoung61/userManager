package com.usermanager.dao;

import java.util.List;

import com.usermanager.entity.User;

public interface UserDao {
	public void addUser(User user);
	public void updateUser(User user);
	public User getUser(int user_id);
	public User getUserByName(String username);
	public void deleteUser(int user_id);
	public List<User> getUsers();
}
