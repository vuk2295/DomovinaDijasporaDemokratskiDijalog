package com.portal.adminpanel.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.portal.adminpanel.domain.KlasaPovezivanja;
import com.portal.adminpanel.domain.Komentari;
import com.portal.adminpanel.services.KomentariService;
import com.portal.adminpanel.domain.Vesti;
import com.portal.adminpanel.services.VestiService;

@RestController
public class AdministratorController {

	@Autowired
	private KomentariService komService;
	
	@Autowired
	private VestiService vesService;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/test")
	public String test() {
		return "TESTIRANJE";
	}
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/dodajKomentar")
	public String metodaPovezivanjaKomentara(@RequestBody KlasaPovezivanja klasaPovezivanja) {
		
		System.out.println("wwwwwwwww");		
		komService.saveKomentar(klasaPovezivanja);
		System.out.println("qqqqqqq");
		return "aaaaaa";
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/listaKomentara")
	public List<Komentari> getAllCriticism () {
		return komService.getCriticism();
	}
	
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/dodajVest")
	public String metodaPovezivanjaVesti(@RequestBody KlasaPovezivanja klasaPovezivanja) {
		
		System.out.println("wwwwwwwww");
		vesService.saveVest(klasaPovezivanja);
		System.out.println("qqqqqqq");
		return "aaaaaa";
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/obrisiVest")
	@ResponseBody
	public String metodaBrisanjaVesti(@RequestBody Vesti vesti) {	
		System.out.println("wwwwwwwww");
		vesService.deleteVest(vesti);
		System.out.println("qqqqqqq");
		return "" + vesti.getIdVesti();
	}
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/obrisiKomentar")
	@ResponseBody
	public String metodaBrisanjaKomentara(@RequestBody Komentari komentari) {	
		System.out.println("wwwwwwwww");
		komService.deleteKomentar(komentari);
		System.out.println("qqqqqqq");
		return "111";
	}

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@GetMapping("/listaVesti")
	public @ResponseBody List<Vesti> getAllProducts() {
        return vesService.getVesti();
    }
}
