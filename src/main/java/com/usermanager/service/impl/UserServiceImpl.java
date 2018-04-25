/*package com.usermanager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usermanager.entity.User;
import com.usermanager.service.IUserService;
@Service
public class UserServiceImpl{
	@Autowired
	//private IBaseDao<User, Integer>	 daoUser;
	@Override
	public void save(User user) {
		daoUser.save(user);

	}

	@Override
	public User findById(int id) {
		String hql=" from "+User.class.getName()+" where id=? ";
		Object[] param=new Object[]{id};
		List<User> list=daoUser.findByHql(hql, param);
		return list.get(0);
	}

	@Override
	public List<User> find() {
		return daoUser.findAll(User.class);
	}

}
*/