package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.FactureVehicule;

public interface FactureVehiculeDAO extends JpaRepository<FactureVehicule, Long> {

}
