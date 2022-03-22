package com.cg.adminrepository;


import com.cg.adminentites.User;

public interface UserRepo {
		public abstract User addNewUser(User user);
		public abstract User updateUser(User user);
		public abstract User deleteUser(User user);
		public abstract void commitTransaction();
		public abstract void beginTransaction();
		

		}