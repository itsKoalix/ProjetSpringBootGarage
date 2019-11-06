package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.EmployeeDAO;
import com.springboot.garage.model.Employe;

@Service
public class ServiceListeEmploye implements IServiceListeEmploye{

	@Autowired
	EmployeeDAO employeDao;
	
	@Override
	public List<Employe> afficherEmployes() {
		return employeDao.findAll();
	}

	@Override
	public Employe trouverEmploye(Long idEmploye) {
		List<Employe> employes = employeDao.findAll();
		for (Employe e : employes) {
			if (e.getId() == idEmploye) {
				return e;
			}
		}
		return null;
	}

	@Override
	public void ajouterEmploye(Employe employe) {
		// TODO Auto-generated method stub
		employeDao.save(employe);
	}

	@Override
	public void modifierEmploye(Employe employe) {
		// TODO Auto-generated method stub
		employeDao.save(employe);
	}

}
