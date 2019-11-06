package com.springboot.garage.services;

import java.util.List;

import com.springboot.garage.model.Piece;

public interface IServiceListePieces {

	List<Piece> afficherPieces();
	Piece trouverPiece(Long idPiece);
	void ajouterPiece(Piece piece);
	void modifierPiece(Piece piece);
}
