/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import database.DatabaseClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import model.Login;

/**
 *
 * @author tahanynemer
 */
public class LoginService{
	
	private static final String String = null;
	private Map<String, Login> logins = DatabaseClass.getLogin();
	
	public LoginService() {
		logins.put(String, new Login("s144260", "139855", true));
	}
	
	
	public List<Login> getAllLogins(){
		return new ArrayList<Login>(logins.values());
	}


	public Login addLogin(Login login) {
		// TODO Auto-generated method stub
		return null;
	}


	public Login updateLogin(Login login) {
		// TODO Auto-generated method stub
		return null;
	}


	public void removeLogin(Login login) {
		// TODO Auto-generated method stub
		
	}
	

}
