package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.Piece;

public interface PieceDAO extends JpaRepository<Piece, Long> {

}
