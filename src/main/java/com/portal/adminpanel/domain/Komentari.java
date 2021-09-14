package com.portal.adminpanel.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="KOMENTARI")


public class Komentari {
	

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "idkomentari")
private Long idkomentari;

//@JsonView(Profile.UserView.class)
@Column(name = "USERNAME")
private String username;

@Column(name = "EMAIL")
private String email;

@Column(name = "NASLOVTEME")
private String naslovteme;

@Column(name = "NASLOVVESTI")
private String naslovvesti;

@Column(name = "KOMENTAR")
private String criticism;

@ManyToOne
@JoinColumn(name="idvesti")
private Vesti vesti;

public Long getIdkomentari() {
	return idkomentari;
}

public void setIdkomentari(Long idkomentari) {
	this.idkomentari = idkomentari;
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

public String getCriticism() {
	return criticism;
}

public void setCriticism(String criticism) {
	this.criticism = criticism;
}

public Vesti getVesti() {
	return vesti;
}

public void setVesti(Vesti vesti) {
	this.vesti = vesti;
}

}
