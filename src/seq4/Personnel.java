package seq4;

/**
 * Created by moran on 03/01/2017.
 */
public class Personnel extends Personne {
    private int echelon;
    private float valeurPointIndice;

    public Personnel (String nom, String prenom, String login) {
        super(login, nom, prenom);
    }

    public Personnel (String nom, String prenom, String login, String adresse) {
        super(login, nom, prenom,adresse);
    }

    public int getEchelon() {
        return echelon;
    }

    public float getValeurPointIndice() {
        return valeurPointIndice;
    }

    public float getSalaire(){
        return echelon*valeurPointIndice;
    }

    public String getMail() {
        return getPrenom()+"."+getNom()+"@univ-grenoble.fr";
    }

    public void setEchelon(int echelon) {
        this.echelon = echelon;
    }

    public void setValeurPointIndice(float valeurPointIndice) {
        this.valeurPointIndice = valeurPointIndice;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "echelon=" + echelon +
                ", valeurPointIndice=" + valeurPointIndice +
                '}';
    }
}
