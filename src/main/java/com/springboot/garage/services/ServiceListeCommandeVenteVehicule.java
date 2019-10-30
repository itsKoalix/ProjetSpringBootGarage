package com.springboot.garage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.CommandeVenteVehiculeDAO;

@Service
public class ServiceListeCommandeVenteVehicule implements IServiceListeCommandeVenteVehicule {

	@Autowired
	CommandeVenteVehiculeDAO commandeVenteVehiculeDAO;
}
