package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Employe;

public interface IServiceListeEmploye {

	List<Employe> afficherEmployes();
	Employe trouverEmploye(Long idEmploye);
	void ajouterEmploye(Employe employe);
	void modifierEmploye(Employe employe);
}
