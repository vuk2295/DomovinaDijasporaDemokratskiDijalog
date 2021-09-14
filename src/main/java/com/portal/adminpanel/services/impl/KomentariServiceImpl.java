package com.portal.adminpanel.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portal.adminpanel.dao.KomentariRepository;
import com.portal.adminpanel.domain.KlasaPovezivanja;
import com.portal.adminpanel.domain.Komentari;
import com.portal.adminpanel.services.KomentariService;


@Service
@Transactional
public class KomentariServiceImpl implements KomentariService {

	
	@Autowired
	private KomentariRepository komentarRepository;

	@Override
	public Komentari saveKomentar(KlasaPovezivanja klasaPovezivanja) {
		Komentari komentari=new Komentari();
		komentari.setUsername(klasaPovezivanja.getUsername());
		komentari.setNaslovTeme(klasaPovezivanja.getNaslovTeme());
		komentari.setNaslovVesti(klasaPovezivanja.getNaslovVesti());
		komentari.setEmail(klasaPovezivanja.getEmail());
		komentari.setCriticism(klasaPovezivanja.getCriticism());

		return komentarRepository.save(komentari);
	}

	@Override
	public List<Komentari> getCriticism() {
		List<Komentari> products = new ArrayList<>();
		komentarRepository.findAll().forEach(products::add);
        return products;
	}
	@Override
	public void deleteKomentar(Komentari komentari) {
		komentarRepository.delete(komentari);
	}
	
}
