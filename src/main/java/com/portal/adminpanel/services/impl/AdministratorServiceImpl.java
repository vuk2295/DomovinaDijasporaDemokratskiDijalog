package com.portal.adminpanel.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portal.adminpanel.dao.AdministratorRepository;
import com.portal.adminpanel.domain.Administratori;
import com.portal.adminpanel.services.AdministratorService;
@Service
@Transactional
public class AdministratorServiceImpl implements AdministratorService {

	
	@Autowired
	private AdministratorRepository userRepository;
	
	@Override
	public Administratori getByUsername(String username) {
		return userRepository.getByUsername(username);		
	}

	@Override
	public boolean saveUser() {
		return false;
	}
}
