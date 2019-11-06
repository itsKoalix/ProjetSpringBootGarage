package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springboot.garage.services.IServiceListeDevis;

@Controller
public class DevisController {

	@Autowired
	IServiceListeDevis commandeVehiculeService;
}
