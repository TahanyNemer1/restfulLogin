/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.util.HashMap;
import java.util.Map;
import model.Login;

/**
 *
 * @author tahanynemer
 */
public class DatabaseClass {
	
	private static Map<String, Login> logins = new HashMap<>();

    public static Map<String, Login> getLogin() {
        return logins;
    }

}