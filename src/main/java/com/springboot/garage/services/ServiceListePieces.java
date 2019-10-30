package com.springboot.garage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.garage.dao.PieceDAO;

@Service
public class ServiceListePieces implements IServiceListePieces {

	@Autowired
	PieceDAO pieceDAO;
}
