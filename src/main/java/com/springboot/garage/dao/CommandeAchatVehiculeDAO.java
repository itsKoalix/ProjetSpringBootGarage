package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.CommandeAchatVehicule;

public interface CommandeAchatVehiculeDAO extends JpaRepository<CommandeAchatVehicule, Long> {

}
