package com.octest.bdd;

import java.util.ArrayList;
import java.util.List;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.octest.beans.Utilisateur;

public class Noms {
	public List<Utilisateur> recupererUtilisateurs(){
		List<Utilisateur> utilisateurs = new ArrayList<Utilisateur>();
		
		//chargement du driver
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException e){
		}
		
		// Connexion à la base 
		Connection connexion = null;
		Statement statement = null;
		ResultSet resultat = null;
		
		try{
			connexion = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/javadb", "root", "leoroot");
			statement = connexion.createStatement();
			
			//Execution de la requete 
			resultat = statement.executeQuery("SELECT nom, prenom FROM noms;");
			
			//Récupération des données
			while (resultat.next()){
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				
				Utilisateur utilisateur = new Utilisateur();
				utilisateur.setNom(nom);
				utilisateur.setPrenom(prenom);
				
				utilisateurs.add(utilisateur);
			}
		} catch(SQLException e){	
			System.out.println("Echec de connexion");
			e.printStackTrace();
		} finally {
			//fermeture de la connexion 
			try{
				if(resultat != null)
					resultat.close();
				if(statement != null)
					statement.close();
				if(connexion != null)
					connexion.close();
			}catch(SQLException ignore){			
			}
		}
			
		return utilisateurs;
		
	}
}
