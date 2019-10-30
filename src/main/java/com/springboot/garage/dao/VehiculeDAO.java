package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.Vehicule;

public interface VehiculeDAO extends JpaRepository<Vehicule, Long> {

}
