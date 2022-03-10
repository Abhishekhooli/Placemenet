package com.cg.adminservice;

import com.cg.adminentites.Admin;

public interface AdminService {
	public abstract void addAdmin(Admin admin);

	public abstract void updateAdmin(Admin admin);

	public abstract void removeAdmin(Admin admin);

	public abstract Admin findAdminById(int id);

}
