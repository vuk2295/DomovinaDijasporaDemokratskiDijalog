package com.portal.adminpanel.services;

import java.util.List;

import com.portal.adminpanel.domain.KlasaPovezivanja;
import com.portal.adminpanel.domain.Komentari;

public interface KomentariService {

	// Ove samo definisem metode 
	public Komentari saveKomentar(KlasaPovezivanja klasaPovezivanja) ;
	
	public void deleteKomentar(Komentari komentari);
	
	public List<Komentari> getCriticism();
}
