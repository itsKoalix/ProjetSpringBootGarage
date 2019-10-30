package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springboot.garage.services.IServiceListeVehicules;

@Controller
public class VehiculeController {

	@Autowired
	IServiceListeVehicules serviceVehicule;
}
