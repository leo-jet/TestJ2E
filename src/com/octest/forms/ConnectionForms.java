package com.octest.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForms {
	
	private String resultat;
	
	public void verifierIdentifiant(HttpServletRequest request){
		String login = request.getParameter("login");
		String pass = request.getParameter("pass");
		if(pass.equals(login+"123")){
			resultat = "Vous vous êtes bien connecté";
			int a = 10, b = 20;
			int max = (a < b) ? ((b < 20) ? b * 2 : ((b > 20) ? b % 3 : b / 4) ) : ((a == 10) ? a / 2 : a % 3);
			resultat += max;
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
