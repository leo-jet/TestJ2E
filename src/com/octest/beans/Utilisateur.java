package com.octest.beans;

public class Utilisateur {
	
	private String nom;
	private String prenom;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) throws BeanException {
		if(nom.length()>10){
			throw new BeanException("Ce nom d�passe 10 caract�res !");
		}else{
			this.nom = nom;
		}
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}
