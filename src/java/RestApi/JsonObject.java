/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestApi;


import org.json.JSONObject;

/**
 *
 * @author tahanynemer
 */
public class JsonObject {
    private String brugernavn;
    private String password;
    
    
    
      public static void main(String[] args) throws Exception {
      JSONObject obj = new JSONObject();

            obj.put("brugernavn", "Tahany");
            obj.put("password", "12345");
            
            try{
                System.out.print(obj.toString());
                
            }catch(Exception e){
            }
            
       }
      
      public boolean login(String brugernavn, String password){
          
        return false;
          
      }

    
   
}
    
  
