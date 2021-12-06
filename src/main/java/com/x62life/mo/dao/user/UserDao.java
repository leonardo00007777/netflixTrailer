package com.x62life.mo.dao.user;


import java.util.List;

import com.x62life.mo.model.common.User;


public interface UserDao {
	
	public   List<User> list(User user);

	public  void register(User user);
	
	public  void modify(User user);
	
	public  void modifyPassword(User user);
	
	public  User selectUser(User user);
	

}
