package com.portal.adminpanel.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portal.adminpanel.domain.Administratori;

public interface AdministratorRepository extends JpaRepository<Administratori, Long> {

	Administratori getByUsername(String username); //Sam dodaje upit 
	
	/*
	 * Sluzi za pisanje upita 
	 * 
	 * @Query(value =
	 * "select a from Article a where a.category = :category and a.city = :cityeee")
	 * List<Article> blabla(@Param("category") String category, @Param("cityeee")
	 * String city);
	 */
	
	
}
