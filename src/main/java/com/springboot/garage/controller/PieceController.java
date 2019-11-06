package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.EmployeForm;
import com.springboot.garage.controller.form.PieceForm;
import com.springboot.garage.enums.Civilite;
import com.springboot.garage.model.Employe;
import com.springboot.garage.services.IServiceListePieces;

@Controller
public class PieceController {

	@Autowired
	IServiceListePieces pieceService;
	
	@GetMapping(value = "/afficherPieces")
	public String afficherPieces(Model model) {
		model.addAttribute("listePieces", pieceService.afficherPieces());
		return "afficherPieces";
	}
	
	@GetMapping(value = "/ajouterPiece")
	public String ajouterPieceGet(Model model) {
		model.addAttribute("pieceForm", new PieceForm());
		model.addAttribute("listePiece", pieceService.afficherPieces());
		return "ajouterPiece";
	}
	//Reprendre ICI
	@PostMapping(value = "/ajouterPiece")
	public String ajouterPiecePost(@ModelAttribute EmployeForm employeForm, Model model) {
		Employe e = new Employe();
		e.setCivility(Civilite.valueOf(employeForm.getCivility()));
		e.setNom(employeForm.getNom());
		e.setPrenom(employeForm.getPrenom());
		e.setIdentifiant(employeForm.getIdentifiant());
		e.setMotDePasse(employeForm.getMotDePasse());
		e.setRoles(employeForm.getRoles());
		return null;
	}
	
	@GetMapping(value = "/modifierEmploye")
	public String modifierEmployeGet(Model model) {
		return "modifierEmploye";
	}
	@PostMapping(value = "/modifierEmploye")
	public String modifierEmployePost(@ModelAttribute EmployeForm employeForm, @ModelAttribute Long employeModId, Model model) {
		
		return null;
	}
}
