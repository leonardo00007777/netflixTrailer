package com.x62life.mo.service.user;

import java.util.List;

import com.x62life.mo.model.common.User;

public interface UserService {

	public List<User> list(User user);
	
	public void register(User user);
	
	public void modify(User user);
	
	public void modifyPassword(User user);

	public User getUser(User user);
	
	
}
