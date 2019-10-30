package com.springboot.garage.controller.form;

public class ClientForm {
	
	String nom;
	String prenom;
	String adresse;
	String codePostalVille;
	String telephone;
	String mobile;
	
	String createur;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostalVille() {
		return codePostalVille;
	}

	public void setCodePostalVille(String codePostalVille) {
		this.codePostalVille = codePostalVille;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCreateur() {
		return createur;
	}

	public void setCreateur(String createur) {
		this.createur = createur;
	}
}
