package RestApi;

import javax.ws.rs.QueryParam;

public class Annotationer {
    private @QueryParam("brugernavn") String brugernavn;
    private @QueryParam("adgangskode") String adgangskode;

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
}
