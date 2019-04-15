/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestApi;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author tahanynemer
 */
public class RestClient {
    
    public static void main(String[] args) {
        
    Client client = ClientBuilder.newClient();
    Response res = client.target("http://localhost:8080/login/webapi/myresource").request(MediaType.APPLICATION_JSON).get();
    String svar = res.readEntity(String.class);
    System.out.println(svar);
    
  }

    
    
}
