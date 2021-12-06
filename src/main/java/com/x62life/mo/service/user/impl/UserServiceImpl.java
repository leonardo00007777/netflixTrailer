package com.x62life.mo.service.user.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.x62life.mo.dao.user.UserDao;
import com.x62life.mo.model.common.User;
import com.x62life.mo.service.user.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    
	@Override
	public List<User> list(User user) {
		
        List<User> list = userDao.list(user);
        
		return list;
	}

	@Override
	public void register(User user) {
		
		userDao.register(user);
	}

	@Override
	public void modify(User user) {
		
		userDao.modify(user);
	}

	@Override
	public void modifyPassword(User user) {
		
		userDao.modifyPassword(user);
	}

	@Override
	public User getUser(User user) {
		
        User userInfo = ((UserService) userDao).getUser(user);
        
		return userInfo;
	}
}



