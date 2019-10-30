package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.FicheEntretien;

public interface IServiceListeFiches {

	List<FicheEntretien> afficherFiches();
	FicheEntretien trouverFiche(Long idFiche);
	void ajouterFiche(FicheEntretien fiche);
	void modifierFiche(FicheEntretien fiche);
}
