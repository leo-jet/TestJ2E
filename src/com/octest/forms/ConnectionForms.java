package com.octest.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForms {
	
	private String resultat;
	
	public void verifierIdentifiant(HttpServletRequest request){
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		if(pass.equals(login+"123")){
			resultat = "Vous vous êtes bien connecté";
		}
		else{
			resultat = "Identifiants incorrects";
		}
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
	
}
