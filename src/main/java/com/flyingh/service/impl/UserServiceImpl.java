package com.flyingh.service.impl;

import org.springframework.stereotype.Service;

import com.flyingh.dao.UserDao;
import com.flyingh.service.UserService;
import com.flyingh.vo.User;

@Service("userService")
public class UserServiceImpl implements UserService {
	private UserDao userDao;

	public void addUser(User user) {
		userDao.add(user);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}
