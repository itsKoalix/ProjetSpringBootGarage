package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.Client;

public interface ClientDAO extends JpaRepository<Client, Long>{

}