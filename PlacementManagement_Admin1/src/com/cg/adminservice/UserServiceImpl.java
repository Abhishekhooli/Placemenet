package com.cg.adminservice;

import com.cg.adminentites.User;
import com.cg.adminrepository.AdminRepoImpl;
import com.cg.adminrepository.UserRepo;
import com.cg.adminrepository.UserRepoImpl;

public class UserServiceImpl implements UserService {
	private UserRepo repo;
	

	public UserServiceImpl() {
		repo=new UserRepoImpl();
	}

	@Override
	public void addNewUser(User user) {
		repo.beginTransaction();
		repo.addNewUser(user);
		repo.commitTransaction();
	}

	@Override
	public void updateUser(User user) {
		repo.beginTransaction();
		repo.updateUser(user);
		repo.commitTransaction();
	}

	public void login1(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void addNewUser1(com.cg.adminentites.User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser1(com.cg.adminentites.User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login1(com.cg.adminentites.User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		
	}
}
