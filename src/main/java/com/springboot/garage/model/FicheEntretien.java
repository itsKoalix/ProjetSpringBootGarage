package com.springboot.garage.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.springboot.garage.enums.EtatFicheEntretien;
import com.springboot.garage.enums.Priority;

@Entity
@Table
public class FicheEntretien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	Date dateDeCreation;
	Date dateDeCloture;
	CommandeEntretien commande;
	Vehicule vehicule;
	EtatFicheEntretien etat = EtatFicheEntretien.En_Attente;
	Priority priorité = Priority.Normal;
	List<Tache> taches;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getDateDeCreation() {
		return dateDeCreation;
	}
	public void setDateDeCreation(Date dateDeCreation) {
		this.dateDeCreation = dateDeCreation;
	}
	public Date getDateDeCloture() {
		return dateDeCloture;
	}
	public void setDateDeCloture(Date dateDeCloture) {
		this.dateDeCloture = dateDeCloture;
	}
	public CommandeEntretien getCommande() {
		return commande;
	}
	public void setCommande(CommandeEntretien commande) {
		this.commande = commande;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	public EtatFicheEntretien getEtat() {
		return etat;
	}
	public void setEtat(EtatFicheEntretien etat) {
		this.etat = etat;
	}
	public Priority getPriorité() {
		return priorité;
	}
	public void setPriorité(Priority priorité) {
		this.priorité = priorité;
	}
	public List<Tache> getTaches() {
		return taches;
	}
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
	
}
