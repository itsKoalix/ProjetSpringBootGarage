package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springboot.garage.services.IServiceListeCommandeVenteVehicule;

@Controller
public class CommandeVenteVehiculeController {

	@Autowired
	IServiceListeCommandeVenteVehicule commandeVehiculeService;
}
