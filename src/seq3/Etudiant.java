package seq3;

import java.util.ArrayList;

/**
 * Created by moran on 03/01/2017.
 */
public class Etudiant extends Personne {

    private String addresseParents;

    public Etudiant(String nom, String prenom, String login){
        super(nom, prenom, login);
    }

    public Etudiant(String login, String nom, String prenom, String adresseE, String adresseP) {
        super(login, nom, prenom, adresseE);
        this.addresseParents = adresseP;
    }

    public void setAddresseParents(String addresseParents) {
        this.addresseParents = addresseParents;
    }

    public String getAdresseParents() {
        return addresseParents;
    }

    public String getMail(){
        String nom = getNom();
        String prenom = getPrenom();
            return prenom+"."+nom+"@etu.univ-grenoble.fr";
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "addresseParents='" + addresseParents + '\'' +
                '}';
    }
}
