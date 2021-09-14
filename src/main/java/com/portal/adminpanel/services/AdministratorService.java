package com.portal.adminpanel.services;

import com.portal.adminpanel.domain.Administratori;

public interface AdministratorService {

	
	public Administratori getByUsername(String username);
	boolean saveUser();
}
