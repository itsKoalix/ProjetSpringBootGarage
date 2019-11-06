package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Employee;

public interface IServiceListeEmployee {

	List<Employee> afficherEmployees();
	Employee trouverEmployee(Long idEmployee);
	void ajouterEmployee(Employee employee);
	void modifierEmployee(Employee employee);
}
