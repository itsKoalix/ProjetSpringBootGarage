package com.springboot.garage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.VehiculeDAO;

@Service
public class ServiceListeVehicules implements IServiceListeVehicules {

	@Autowired
	VehiculeDAO vehiculeDAO;
}
