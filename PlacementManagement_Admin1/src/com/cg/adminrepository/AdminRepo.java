package com.cg.adminrepository;

import com.cg.adminentites.Admin;

public interface  AdminRepo {
	public abstract Admin getAdminById(int id);

	public abstract void addAdmin(Admin admin);

	public abstract void removeAdmin(Admin admin);

	public abstract void updateAdmin(Admin admin);

	public abstract void commitTransaction();

	public abstract void beginTransaction();

	
}

