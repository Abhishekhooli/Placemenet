package com.cg.adminservice;

import com.cg.adminentites.User;

public interface UserService {
	public void addNewUser(User user);
	public void updateUser(User user);
	public void login(User user);
	public boolean logOut();
	void addNewUser1(User user);
	void updateUser1(User user1);
	void login1(User user1);
	
}