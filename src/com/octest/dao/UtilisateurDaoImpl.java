package com.octest.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.octest.beans.Utilisateur;

public class UtilisateurDaoImpl implements UtilisateurDao {
	private DaoFactory daoFactory;

	public UtilisateurDaoImpl(DaoFactory daoFactory) {
		this.daoFactory = daoFactory;
	}

	@Override
	public void ajouterUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		Connection connexion = null;
		PreparedStatement pStatement = null;
		
		try {
			connexion = daoFactory.getConnection();
			pStatement = connexion.prepareStatement("INSERT INTO noms(nom, prenom) VALUE(?,?);");
			pStatement.setString(1, utilisateur.getNom());
			pStatement.setString(2, utilisateur.getPrenom());
			
			pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Utilisateur> liste() {
		// TODO Auto-generated method stub
		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;
		
		try {
			connexion = daoFactory.getConnection();
			statement = connexion.createStatement();
			resultat = statement.executeQuery("SELECT nom, prenom FROM noms;");
			
			while (resultat.next()){
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNom(nom);
				utilisateur.setPrenom(prenom);
				
				utilisateurs.add(utilisateur);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return utilisateurs;
	}
	
}
