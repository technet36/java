package seq4;

import java.util.ArrayList;

/**
 * Created by moran on 03/01/2017.
 */
public class Etudiant extends Personne {

    private String addresseParents;
    private ArrayList<Note> bulletin = new ArrayList<Note>() ;

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

    public String getBulletin() {
        int size = this.bulletin.size();
        float myTab[] = new float[size];
        for (int i=0; i < size;i++) {
            myTab[i] = bulletin.get(i).getValeur();
            //System.out.println(bulletin.get(i).getValeur());
            //System.out.println(myTab[i]);
            //System.out.println(myTab);

        }
        return bulletin.toString();
    }

    public void addNote() {
        Note maNote = new Note();
        maNote.saisir();
       this.bulletin.add(maNote);
    }

    public float getMoyenne () {
        int size = bulletin.size();
        float maMoyenne = 0;
        for (Note aBulletin : bulletin) {
            maMoyenne = maMoyenne+ aBulletin.getValeur();
        }
        return maMoyenne/size;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "addresseParents='" + addresseParents + '\'' +
                '}';
    }
}
