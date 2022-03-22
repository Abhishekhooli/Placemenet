package com.cg.adminrepository;

import javax.persistence.EntityManager;

import com.cg.adminentites.Admin;

public class AdminRepoImpl implements AdminRepo {
	private EntityManager entityManager;

	public AdminRepoImpl() {
		entityManager = JPAUtil.getEntityManager();
	}

	@Override
	public Admin getAdminById(int id) {
		Admin admin = entityManager.find(Admin.class, id);
		return admin;
	}

	@Override
	public void addAdmin(Admin admin) {
		entityManager.persist(admin);

	}

	@Override
	public void removeAdmin(Admin admin) {
		entityManager.remove(admin);

	}

	@Override
	public void updateAdmin(Admin admin) {
		entityManager.merge(admin);

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

