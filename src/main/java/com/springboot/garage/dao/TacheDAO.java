package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.Tache;

public interface TacheDAO extends JpaRepository<Tache, Long> {

}
