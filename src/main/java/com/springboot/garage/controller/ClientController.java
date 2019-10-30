package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.garage.controller.form.ClientForm;
import com.springboot.garage.model.Client;
import com.springboot.garage.services.IServiceListeClients;

@Controller
public class ClientController {

	@Autowired
	IServiceListeClients clientService;
	
	@GetMapping(value = "/afficherClients")
	public String afficherClients(Model model) {
		model.addAttribute("listeClients", clientService.afficherClients());
		return "afficherClients";
	}
	
	@GetMapping(value = "/ajouterClient")
	public String ajouterClientGet(Model model) {
		model.addAttribute("clientForm", new ClientForm());
		model.addAttribute("listeClients", clientService.afficherClients());
		return "ajouterClient";
	}
	@PostMapping(value = "/ajouterClient")
	public String ajouterClientPost(@ModelAttribute ClientForm clientForm, Model model) {
		Client c = new Client();
		c.setNom(clientForm.getNom());
		c.setPrenom(clientForm.getPrenom());
		c.setAdresse(clientForm.getAdresse());
		c.setCodePostalVille(clientForm.getCodePostalVille());
		c.setTelephone(clientForm.getTelephone());
		c.setMobile(clientForm.getMobile());
		c.setCreateur(Integer.parseInt(clientForm.getCreateur()));
		clientService.ajouterClient(c);
		return null;
	}
	
	@GetMapping(value = "/modifierClient")
	public String modifierClientGet(Model model) {
		model.addAttribute("clientForm", new ClientForm());
		model.addAttribute("listeClients", clientService.afficherClients());
		return "ajouterClient";
	}
	@PostMapping(value = "/modifierClient")
	public String modifierClientPost(@ModelAttribute ClientForm clientForm, Model model) {
		Client c = new Client();
		//Client ID
		c.setNom(clientForm.getNom());
		c.setPrenom(clientForm.getPrenom());
		c.setAdresse(clientForm.getAdresse());
		c.setCodePostalVille(clientForm.getCodePostalVille());
		c.setTelephone(clientForm.getTelephone());
		c.setMobile(clientForm.getMobile());
		c.setCreateur(Integer.parseInt(clientForm.getCreateur()));
		clientService.modifierClient(c);
		return null;
	}
	
}
