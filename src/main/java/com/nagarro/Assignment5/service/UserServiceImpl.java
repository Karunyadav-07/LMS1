package com.nagarro.Assignment5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.Assignment5.dao.UserDao;
import com.nagarro.Assignment5.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userdao;

	public User login(User user) {
		
		return userdao.login(user);
	}

}
