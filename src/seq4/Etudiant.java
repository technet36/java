package seq4;

import java.util.ArrayList;

/**
 * Created by moran on 03/01/2017.
 */
public class Etudiant extends Personne {

    private String addresseParents;
    private ArrayList<Note> notes ;

    public Etudiant(String nom, String prenom, String login){
        super(nom, prenom, login);
        notes = new ArrayList<>();
    }

    public Etudiant(String login, String nom, String prenom, String adresseE, String adresseP) {
        super(login, nom, prenom, adresseE);
        this.addresseParents = adresseP;
        notes = new ArrayList<>();
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

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void addNote() {
        Note maNote = new Note();
        maNote.saisir();
       this.notes.add(maNote);
    }
    public void addNote(float maValeur){
        Note maNote = new Note(maValeur);
        this.notes.add(maNote);
    }

    public Note getMoyenne () {
        int size = notes.size();
        Note maMoyenne = new Note(0);
        for (Note aBulletin : notes)
            maMoyenne.setValeur(maMoyenne.getValeur()+ aBulletin.getValeur()/aBulletin.getMax());
        maMoyenne.setValeur(maMoyenne.getValeur()/size*maMoyenne.getMax());
        return maMoyenne;
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "addresseParents='" + addresseParents + '\'' +
                '}';
    }
}
