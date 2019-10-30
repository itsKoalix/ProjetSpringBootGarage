package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.CommandeVenteVehicule;

public interface CommandeVenteVehiculeDAO extends JpaRepository<CommandeVenteVehicule, Long> {

}
