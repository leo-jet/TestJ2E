package com.octest.dao;

import java.util.List;

import com.octest.beans.Utilisateur;

public interface UtilisateurDao {
	void ajouterUtilisateur(Utilisateur utilisateur);
	List<Utilisateur> liste();
}
