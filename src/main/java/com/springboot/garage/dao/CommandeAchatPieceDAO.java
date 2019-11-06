package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.CommandeAchatPiece;

public interface CommandeAchatPieceDAO extends JpaRepository<CommandeAchatPiece, Long> {

}
