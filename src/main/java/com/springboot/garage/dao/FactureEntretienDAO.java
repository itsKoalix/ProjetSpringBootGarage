package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.FactureEntretien;

public interface FactureEntretienDAO extends JpaRepository<FactureEntretien, Long> {

}
