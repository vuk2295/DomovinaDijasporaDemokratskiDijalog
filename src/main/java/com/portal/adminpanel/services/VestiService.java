package com.portal.adminpanel.services;

import java.util.List;

import com.portal.adminpanel.domain.KlasaPovezivanja;
import com.portal.adminpanel.domain.Vesti;

public interface VestiService {

	// Ove samo definisem metode 
	public Vesti saveVest(KlasaPovezivanja klasaPovezivanja) ;
	
	public void deleteVest(Vesti vesti);
	
	public List<Vesti> getVesti();
}
