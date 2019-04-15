/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestApi;

import brugerautorisation.data.Bruger;
import brugerautorisation.transport.rmi.Brugeradmin;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author tahanynemer
 */
public class FinalProjekt {
    private String brugernavn;
    private String password;
    

      public boolean login(String brugernavn, String password) throws NotBoundException, MalformedURLException, RemoteException {
        Brugeradmin ba = (Brugeradmin) Naming.lookup("rmi://javabog.dk/brugeradmin");
        try{
            Bruger b = ba.hentBruger(brugernavn, password);
            this.brugernavn = brugernavn;
            this.password = password;
        }catch(IllegalArgumentException e){
            System.out.println("Forkert bruger navn eller password!");
            return false;
        }
        return true;
    }
     
        
      
    
}
