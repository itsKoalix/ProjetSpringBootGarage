package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.TacheForm;
import com.springboot.garage.model.Tache;
import com.springboot.garage.services.IServiceListeTaches;

@Controller
public class TacheController {

	@Autowired
	IServiceListeTaches tacheService;
	
	@GetMapping(value = "/afficherTaches")
	public String afficherTache(Model model) {
		model.addAttribute("listeTaches", tacheService.afficherTaches());
		return "afficherTaches";
	}
	
	@GetMapping(value = "/ajouterTache")
	public String ajouterTacheGet(Model model) {
		model.addAttribute("tacheForm", new TacheForm());
		model.addAttribute("listeTaches", tacheService.afficherTaches());
		return "ajouterTache";
	}
	@PostMapping(value = "/ajouterTache")
	public String ajouterTachePost(@ModelAttribute TacheForm tacheForm, Model model) {
		Tache t = new Tache();
		//t.setClient(tacheForm.getClient());
		//t.setDateDeCreation(tacheForm.getDateDeCreation());
		//t.setEntretien(tacheForm.getEntretien());
		//t.setEtat(tacheForm.getStatus());
		t.setDetails(tacheForm.getDetails());
		tacheService.ajouterTache(t);
		return null;
	}
	
	@GetMapping(value = "/modifierTache")
	public String modifierTacheGet(Model model) {
		model.addAttribute("tacheForm", new TacheForm());
		model.addAttribute("listeTache", tacheService.afficherTaches());
		return "modifierTache";
	}
	@PostMapping(value = "/modifierTache")
	public String modifierTachePost(@ModelAttribute TacheForm tacheForm, Model model) {
		Tache t = new Tache();
		//t.setClient(tacheForm.getClient());
		//t.setDateDeCreation(tacheForm.getDateDeCreation());
		//t.setEntretien(tacheForm.getEntretien());
		//t.setStatus(tacheForm.getStatus());
		t.setDetails(tacheForm.getDetails());
		tacheService.modifierTache(t);
		return null;
	}
	
	@GetMapping(value = "/SupprimerTache")
	public String SupprimerTacheForm(Model model) {
		model.addAttribute("tacheSupprId", new Long(0));
		model.addAttribute("listeTaches", tacheService.afficherTaches());
		return "supprimerTache";
	}
	@PostMapping(value = "/SupprimerTache")
	public String SupprimerTacheSubmit(@ModelAttribute Long tacheSupprId, Model model) {
		tacheService.supprimerTache(tacheService.trouverTache(tacheSupprId));
		return null;
	}
}
