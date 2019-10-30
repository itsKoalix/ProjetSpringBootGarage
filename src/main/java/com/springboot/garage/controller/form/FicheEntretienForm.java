package com.springboot.garage.controller.form;

public class FicheEntretienForm {

	String dateDeCreation;
	String commande;
	String Vehicule;
	String etat = "En_Attente";
	String priorité = "Normal";
	String taches;
	
	
	
	public String getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(String dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	public String getCommande() {
		return commande;
	}
	public void setCommande(String commande) {
		this.commande = commande;
	}
	public String getVehicule() {
		return Vehicule;
	}
	public void setVehicule(String vehicule) {
		Vehicule = vehicule;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getPriorité() {
		return priorité;
	}
	public void setPriorité(String priorité) {
		this.priorité = priorité;
	}
	public String getTaches() {
		return taches;
	}
	public void setTaches(String taches) {
		this.taches = taches;
	}
	
}
