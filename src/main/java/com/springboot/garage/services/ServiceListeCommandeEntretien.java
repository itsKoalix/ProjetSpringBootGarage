package com.springboot.garage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.CommandeEntretienDAO;

@Service
public class ServiceListeCommandeEntretien implements IServiceListeCommandeEntretien {

	@Autowired
	CommandeEntretienDAO commandeEntretienDAO;
}