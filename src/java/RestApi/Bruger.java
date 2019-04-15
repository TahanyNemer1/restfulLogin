package RestApi;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Bruger {

   private String brugernavn;
   private String adgangskode;
   private Boolean loggedIn;

   public Bruger(){

   }

   public Bruger(String brugernavn, String adgangskode){

       this.brugernavn = brugernavn;
       this.adgangskode = adgangskode;
   }

    public String getBrugernavn() {
        return brugernavn;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public String getAdgangskode() {
        return adgangskode;
    }

    public void setAdgangskode(String adgangskode) {
        this.adgangskode = adgangskode;
    }

    public Boolean getLoggedIn() {
        return loggedIn;
    }

    public boolean setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
        return false;
    }
}
