package seq3;

import java.util.ArrayList;

/**
 * Created by moran on 03/01/2017.
 */
public class Etudiant {
    private String login;
    private String nom;
    private String prenom;
    private String adresse;
    private ArrayList notes;

    public Etudiant(String login, String nom, String prenom) {
        this.login = login;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getMail() {
        return prenom+"."+nom+"@etu.univ-grenoble.fr";
    }

    public String getNomComplet() {
        return prenom+" "+nom;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public ArrayList getNotes() {
        return notes;
    }

    public void addNotes(float note) {
        this.notes.add(note);
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
