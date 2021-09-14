package com.portal.adminpanel.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.portal.adminpanel.dao.VestiRepository;
import com.portal.adminpanel.domain.KlasaPovezivanja;
import com.portal.adminpanel.domain.Vesti;
import com.portal.adminpanel.services.VestiService;


@Service
@Transactional
public class VestiServiceImpl implements VestiService {

	
	@Autowired
	private VestiRepository vestRepository;

	@Override
	public Vesti saveVest(KlasaPovezivanja klasaPovezivanja) {
		Vesti vesti=new Vesti();
		vesti.setNaslovTeme(klasaPovezivanja.getNaslovTeme());
		vesti.setNaslovVesti(klasaPovezivanja.getNaslovVesti());
		vesti.setTextVesti(klasaPovezivanja.getTextVesti());
		vesti.setDatumVesti(klasaPovezivanja.getDatumVesti());
		return vestRepository.save(vesti);
	}

	@Override
	public List<Vesti> getVesti() {
		List<Vesti> products = new ArrayList<>();
		vestRepository.findAll().forEach(products::add);
        return products;
	}
	@Override
	public void deleteVest(Vesti vesti) {
		vestRepository.delete(vesti);
	}

}
