package com.lezhi.demo.biz.service;

import com.lezhi.demo.model.validation.User;

public interface LoginService {
  public User findUser(String userName) throws Exception;

  public boolean insert(User user) throws Exception;

  public boolean deleteUser(String id) throws Exception;
}
