package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.EmployeeForm;
import com.springboot.garage.controller.form.PieceForm;
import com.springboot.garage.enums.Civility;
import com.springboot.garage.model.Employee;
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
	public String ajouterPiecePost(@ModelAttribute EmployeeForm employeeForm, Model model) {
		Employee e = new Employee();
		e.setCivility(Civility.valueOf(employeeForm.getCivility()));
		e.setNom(employeeForm.getNom());
		e.setPrenom(employeeForm.getPrenom());
		e.setIdentifiant(employeeForm.getIdentifiant());
		e.setMotDePasse(employeeForm.getMotDePasse());
		e.setRoles(employeeForm.getRoles());
		employeeService.ajouterEmployee(e);
		return null;
	}
	
	@GetMapping(value = "/modifierEmployee")
	public String modifierEmployeeGet(Model model) {
		model.addAttribute("employeeForm", new EmployeeForm());
		model.addAttribute("employeeModId", new Long(0));		
		model.addAttribute("listeEmployees", employeeService.afficherEmployees());
		return "modifierEmployee";
	}
	@PostMapping(value = "/modifierEmployee")
	public String modifierEmployeePost(@ModelAttribute EmployeeForm employeeForm, @ModelAttribute Long employeeModId, Model model) {
		Employee e = employeeService.trouverEmployee(employeeModId);
		e.setCivility(Civility.valueOf(employeeForm.getCivility()));
		e.setNom(employeeForm.getNom());
		e.setPrenom(employeeForm.getPrenom());
		e.setIdentifiant(employeeForm.getIdentifiant());
		e.setMotDePasse(employeeForm.getMotDePasse());
		e.setRoles(employeeForm.getRoles());
		employeeService.modifierEmployee(e);
		return null;
	}
}
