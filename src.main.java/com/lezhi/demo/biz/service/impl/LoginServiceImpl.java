package com.lezhi.demo.biz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lezhi.demo.biz.service.LoginService;
import com.lezhi.demo.dao.LoginDao;
import com.lezhi.demo.model.validation.User;

@Service
public class LoginServiceImpl implements LoginService{
   @Autowired
   private LoginDao loginDao;
   
	@Override
	public User findUser(String userName) throws Exception {
		return loginDao.findUser(userName);
	}

	@Override
	public boolean insert(User user) throws Exception {
		return loginDao.insert(user);
	}

	@Override
	public boolean deleteUser(String id) throws Exception {
		return loginDao.delete(User.class,id);
	}
}
