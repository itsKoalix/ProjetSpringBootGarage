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
	
	Client client;
	Employe employe;
	Date dateDeCreation;
	Date dateDeCloture;
	String description;
	EtatFicheEntretien etat = EtatFicheEntretien.En_Attente;
	Priority priorité = Priority.Normal;
	List<Tache> taches;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Employe getEmploye() {
		return employe;
	}
	public void setEmploye(Employe employe) {
		this.employe = employe;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
