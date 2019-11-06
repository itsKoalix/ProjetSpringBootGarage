package com.springboot.garage.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CommandeAchatVehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	Date dateDeCreation;
	Date dateDeCloture;
	Devis devis;
	Vehicule vehicule;
	int quantity;
	
}
