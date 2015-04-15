package com.octest.dao;

import java.util.List;

import com.octest.beans.Utilisateur;

public interface UtilisateurDao {
	void ajouterUtilisateur(Utilisateur utilisateur) throws DaoException;
	List<Utilisateur> liste();
}
