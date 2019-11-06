package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.Devis;

public interface DevisDAO extends JpaRepository<Devis, Long> {

}
