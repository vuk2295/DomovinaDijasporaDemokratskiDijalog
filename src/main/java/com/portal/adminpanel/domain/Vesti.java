package com.portal.adminpanel.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="VESTI")


public class Vesti {
	

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "IDVESTI")
private Long idvesti;

//@JsonView(Profile.UserView.class)
@Column(name = "NASLOVTEME")
private String naslovteme;

@Column(name = "NASLOVVESTI")
private String naslovvesti;

@Column(name = "TEXTVESTI")
private String textvesti;

@Column (name = "DATE")
private String datumvesti;

@OneToMany (mappedBy = "vesti")
private List <Komentari> komentari;

public Vesti() {
	
}

public Vesti(int idvesti, String naslovteme, String naslovvesti, String textvesti, String datumvesti) {
	this.idvesti = (long) idvesti;
	this.naslovteme = naslovteme;
	this.naslovvesti = naslovvesti;
	this.textvesti = textvesti;
	this.datumvesti = datumvesti;
}

public Long getIdVesti() {
	return idvesti;
}

public void setIdVesti(Long idvesti) {
	this.idvesti = idvesti;
}

public String getNaslovTeme() {
	return naslovteme;
}

public void setNaslovTeme(String naslovteme) {
	this.naslovteme = naslovteme;
}

public String getNaslovVesti() {
	return naslovvesti;
}

public void setNaslovVesti(String naslovvesti) {
	this.naslovvesti = naslovvesti;
}

public String getTextVesti() {
	return textvesti;
}

public void setTextVesti(String textvesti) {
	this.textvesti = textvesti;
}
public String getDatumVesti() {
	return datumvesti;
}

public void setDatumVesti(String date) {
	this.datumvesti = date;
}


}
