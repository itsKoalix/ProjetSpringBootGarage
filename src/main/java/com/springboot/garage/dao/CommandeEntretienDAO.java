package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.CommandeEntretien;

public interface CommandeEntretienDAO extends JpaRepository<CommandeEntretien, Long> {

}
