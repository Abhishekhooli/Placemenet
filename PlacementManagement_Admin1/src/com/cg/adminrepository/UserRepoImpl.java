package com.cg.adminrepository;



import javax.persistence.EntityManager;

import com.cg.adminentites.User;


public class UserRepoImpl implements UserRepo {
	private EntityManager entityManager;
	


	public UserRepoImpl() {
		entityManager=JPAUtil.getEntityManager();
	
	}

	@Override
	public  User addNewUser(User user) {
		entityManager.persist(user);
		return user;
		
		
		
	}

	@Override
	public User updateUser(User user) {
		  entityManager.merge(user);
		return user;
	}

	@Override
	public User deleteUser(User user) {
	entityManager.remove(user);
	return user;
	
	}

	@Override
	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}

	@Override
	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}
	

}
