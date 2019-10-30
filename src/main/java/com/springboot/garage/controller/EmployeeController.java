package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.EmployeeForm;
import com.springboot.garage.model.Employee;
import com.springboot.garage.services.IServiceListeEmployee;

@Controller
public class EmployeeController {

	@Autowired
	IServiceListeEmployee employeeService;
	
	@GetMapping(value = "/afficherEmployees")
	public String afficherEmployees(Model model) {
		model.addAttribute("listeEmployees", employeeService.afficherEmployee());
		return "afficherEmployees";
	}
	
	@GetMapping(value = "/ajouterEmployee")
	public String ajouterEmployeeGet(Model model) {
		model.addAttribute("employeeForm", new EmployeeForm());
		model.addAttribute("listeEmployees", employeeService.afficherEmployee());
		return "ajouterEmployee";
	}
	@PostMapping(value = "/ajouterEmployee")
	public String ajouterEmployeePost(@ModelAttribute EmployeeForm employeeForm, Model model) {
		Employee e = new Employee();
		e.setNom(employeeForm.getNom());
		e.setPrenom(employeeForm.getPrenom());
		e.setTelephone(employeeForm.getTelephone());
		e.setIdentifiant(employeeForm.getIdentifiant());
		e.setMotDePasse(employeeForm.getMotDePasse());
		employeeService.ajouterEmployee(e);
		return null;
	}
	
	@GetMapping(value = "/modifierEmployee")
	public String modifierEmployeeGet(Model model) {
		model.addAttribute("employeeForm", new EmployeeForm());
		model.addAttribute("listeEmployees", employeeService.afficherEmployee());
		return "modifierEmployee";
	}
	@PostMapping(value = "/modifierEmployee")
	public String modifierEmployeePost(@ModelAttribute EmployeeForm employeeForm, Model model) {
		Employee e = new Employee();
		//Employee ID
		e.setNom(employeeForm.getNom());
		e.setPrenom(employeeForm.getPrenom());
		e.setTelephone(employeeForm.getTelephone());
		e.setIdentifiant(employeeForm.getIdentifiant());
		e.setMotDePasse(employeeForm.getMotDePasse());
		employeeService.modifierEmployee(e);
		return null;
	}
	
	@GetMapping(value = "/SupprimerEmployee")
	public String SupprimerEmployeeForm(Model model) {
		model.addAttribute("employeeSupprId", new Long(0));
		model.addAttribute("listeEmployees", employeeService.afficherEmployee());
		return "supprimerEmployee";
	}
	@PostMapping(value = "/SupprimerEmployee")
	public String SupprimerEmployeeSubmit(@ModelAttribute Long employeeSupprId, Model model) {
		employeeService.supprimerEmployee(employeeService.trouverEmployee(employeeSupprId));
		return null;
	}
}
