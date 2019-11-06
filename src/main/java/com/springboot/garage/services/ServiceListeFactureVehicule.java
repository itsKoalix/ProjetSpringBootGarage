package com.springboot.garage.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.garage.dao.FactureVehiculeDAO;

public class ServiceListeFactureVehicule implements IServiceListeFactureVehicule {
	
	@Autowired
	FactureVehiculeDAO factureVehiculeDAO;
}
