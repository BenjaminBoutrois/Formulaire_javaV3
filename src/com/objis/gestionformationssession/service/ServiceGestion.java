/**
 * Classe utilisateur service du projet Formulaire Java JSP Servlet
 * 
 * @author Master 1 ED2O
 * @version 0.0.1
 */
package com.objis.gestionformationssession.service;

import com.objis.gestionformationssession.dao.UserDAO;
import com.objis.gestionformationssession.metier.User;

public class ServiceGestion {
	
	private UserDAO userDAO;
	
	public ServiceGestion() {
		userDAO = new UserDAO();
	}
	
	public boolean authentificate(String mail, String password) {
		return userDAO.getUser(mail, password);
	}
	
	public User getUser(String mail) {
		return userDAO.getUser(mail);
	}
	
	public void create(String nom, String prenom, String mail, String mdp) {
		userDAO.createUser(nom, prenom, mail, mdp);
	}
	
	public void getAll() {
		userDAO.getAllUser();
	}
}
