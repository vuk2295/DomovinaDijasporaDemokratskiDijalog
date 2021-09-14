package com.portal.adminpanel.domain;

public class KlasaPovezivanja {

	
	private String username;
	
	private String email;
	
	private String criticism;
	
	private String naslovTeme;
	
	private String naslovVesti;
	
	private String textVesti;
	
	private String datumVesti;

	private Long idVesti;
	
	public void setIdVesti(Long idVesti) {
		this.idVesti = idVesti;
	}

	public Long getIdVesti() {
		return idVesti;
	}
	
	public String getNaslovTeme() {
		return naslovTeme;
	}

	public void setNaslovTeme(String naslovTeme) {
		this.naslovTeme = naslovTeme;
	}

	public String getNaslovVesti() {
		return naslovVesti;
	}

	public void setNaslovVesti(String naslovVesti) {
		this.naslovVesti = naslovVesti;
	}
	
	public String getTextVesti() {
		return textVesti;
	}

	public void setTextVesti(String textVesti) {
		this.textVesti = textVesti;
	}
	
	public String getDatumVesti() {
		return datumVesti;
	}

	public void setDatumVesti(String datumVesti) {
		this.datumVesti = datumVesti;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCriticism() {
		return criticism;
	}

	public void setCriticism(String criticism) {
		this.criticism = criticism;
	}
	
	
	
	
	
	
}
