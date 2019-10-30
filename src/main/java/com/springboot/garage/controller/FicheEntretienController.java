package com.springboot.garage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springboot.garage.services.IServiceListeFiches;

@Controller
public class FicheEntretienController {
	
	@Autowired
	IServiceListeFiches serviceFiche;
	
}
