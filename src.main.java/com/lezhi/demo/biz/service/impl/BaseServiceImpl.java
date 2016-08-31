package com.lezhi.demo.biz.service.impl;

import java.io.Serializable;

import com.lezhi.demo.biz.service.BaseService;

public abstract class BaseServiceImpl<T,ID extends Serializable> implements BaseService<T, Serializable> {
    @Override
	public boolean insert(T obj) throws Exception {
		return false;
    }
    
    @Override
    public boolean update(T obj) throws Exception {
    	return false;
    }
    
    @Override
    public boolean delete(Class<?> c, String id) throws Exception {
    	return false;
    }
}
