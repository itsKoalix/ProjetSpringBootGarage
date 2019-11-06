package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.EmployeForm;
import com.springboot.garage.enums.Civilite;
import com.springboot.garage.model.Employe;
import com.springboot.garage.services.IServiceListeEmploye;

@Controller
public class EmployeController {

	@Autowired
	IServiceListeEmploye employeService;
	
	@GetMapping(value = "/afficherEmployes")
	public String afficherEmployes(Model model) {
		model.addAttribute("listeEmployes", employeService.afficherEmployes());
		return "afficherEmployes";
	}
	
	@GetMapping(value = "/ajouterEmploye")
	public String ajouterEmployeGet(Model model) {
		model.addAttribute("employeForm", new EmployeForm());
		model.addAttribute("listeEmployes", employeService.afficherEmployes());
		return "ajouterEmploye";
	}
	@PostMapping(value = "/ajouterEmploye")
	public String ajouterEmployePost(@ModelAttribute EmployeForm employeForm, Model model) {
		Employe e = new Employe();
		e.setCivility(Civilite.valueOf(employeForm.getCivility()));
		e.setNom(employeForm.getNom());
		e.setPrenom(employeForm.getPrenom());
		e.setIdentifiant(employeForm.getIdentifiant());
		e.setMotDePasse(employeForm.getMotDePasse());
		e.setRoles(employeForm.getRoles());
		employeService.ajouterEmploye(e);
		return null;
	}
	
	@GetMapping(value = "/modifierEmploye")
	public String modifierEmployeGet(Model model) {
		model.addAttribute("employeForm", new EmployeForm());
		model.addAttribute("employeModId", new Long(0));		
		model.addAttribute("listeEmployes", employeService.afficherEmployes());
		return "modifierEmploye";
	}
	@PostMapping(value = "/modifierEmploye")
	public String modifierEmployePost(@ModelAttribute EmployeForm employeForm, @ModelAttribute Long employeModId, Model model) {
		Employe e = employeService.trouverEmploye(employeModId);
		e.setCivility(Civilite.valueOf(employeForm.getCivility()));
		e.setNom(employeForm.getNom());
		e.setPrenom(employeForm.getPrenom());
		e.setIdentifiant(employeForm.getIdentifiant());
		e.setMotDePasse(employeForm.getMotDePasse());
		e.setRoles(employeForm.getRoles());
		employeService.modifierEmploye(e);
		return null;
	}
	
}
