package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springboot.garage.services.IServiceListeCommandeEntretien;

@Controller
public class CommandeEntretienController {

	@Autowired
	IServiceListeCommandeEntretien commandeEntretienService;
}
