package com.springboot.garage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.FactureEntretienDAO;

@Service
public class ServiceListeFactureEntretien implements IServiceListeFactureEntretien {

	@Autowired
	FactureEntretienDAO factureEntretienDAO;
}