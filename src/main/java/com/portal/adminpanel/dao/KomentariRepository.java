package com.portal.adminpanel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.adminpanel.domain.Komentari;

public interface KomentariRepository  extends JpaRepository<Komentari, Long> {

	// Save metoda ( prihvata entitet na koji se odnosi (Komentr). Ova metoda radi Save ili Update, Delete metoda (ona brise po ID entitet), 
	//get metoda (FindOne)  da nadje po ID,i FindAll metoda koja pronalazi sve entitete)
	
	
	
}
