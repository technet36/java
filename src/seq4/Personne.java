package seq4;

/**
 * Created by moran on 03/01/2017.
 */
public abstract class Personne {

    private String login;
    private String nom;
    private String prenom;
    private String adresse;

    public Personne(String login, String nom, String prenom) {
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String login, String nom, String prenom, String adresse) {
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public String getLogin() {
        return login;
    }

    /**
     *
     * @return l'adreesse de la personne
     */
    public String getAdresse() {
        return adresse;
    }

    public abstract String getMail();

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNomComplet() {
        return prenom+" "+nom;
    }


    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Etudiant.Etudiant{" +
                "login='" + login + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

}
