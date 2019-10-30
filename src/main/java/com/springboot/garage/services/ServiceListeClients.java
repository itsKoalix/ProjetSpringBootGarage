package com.springboot.garage.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.ClientDAO;
import com.springboot.garage.model.Client;

@Service
public class ServiceListeClients implements IServiceListeClients {

	@Autowired
	ClientDAO clientDao;
	
	@Override
	public List<Client> afficherClients() {
		// TODO Auto-generated method stub
		return clientDao.findAll();
	}

	@Override
	public Client trouverClient(Long idClient) {
		// TODO Auto-generated method stub
		List<Client> clients = clientDao.findAll();
		for (Client c : clients) {
			if (c.getId() == idClient) {
				return c;
			}
		}
		return null;
	}

	@Override
	public void ajouterClient(Client client) {
		// TODO Auto-generated method stub
		clientDao.save(client);
	}

	@Override
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub
		clientDao.save(client);
	}

}
