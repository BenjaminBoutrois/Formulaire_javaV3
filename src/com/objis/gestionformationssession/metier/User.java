/**
 * La classse Utilisateur du projet Formulaire Java JSP Servlet
 */
package com.objis.gestionformationssession.metier;

public class User {

	private String login, password;

	public User(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
