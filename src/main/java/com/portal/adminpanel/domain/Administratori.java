package com.portal.adminpanel.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import ovir.controller.Profile;

@Entity
@Table(name = "ADMINISTRATORI")
public class Administratori {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "idAdministratori")
private Long idAdministratori;

//@JsonView(Profile.UserView.class)
@Column(name = "USERNAME")
private String username;

@Column(name = "PASSWORD")
private String password;





public Administratori() {

	
}





public Long getIdAdministratori() {
	return idAdministratori;
}





public void setIdAdministratori(Long idAdministratori) {
	this.idAdministratori = idAdministratori;
}





public String getUsername() {
	return username;
}





public void setUsername(String username) {
	this.username = username;
}





public String getPassword() {
	return password;
}





public void setPassword(String password) {
	this.password = password;
}


}

