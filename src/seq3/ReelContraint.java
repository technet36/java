package seq3;

import java.util.Scanner;

/**
 * Created by moran on 03/01/2017.
 */
public class ReelContraint {
    private float min ;
    private float max ;
    private float valeur;


    public ReelContraint(float min, float max) {
        this.min = min;
        this.max = max;
        this.valeur = min;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        if (valeur>=min && valeur<=max)
            this.valeur = valeur;
    }

    public void saisir() {
        float maNote;
        Scanner entree = new Scanner(System.in);
        do {
            System.out.print("Saisir la Note : ");
            maNote = entree.nextFloat();
            setValeur(maNote);
        }while (maNote<this.min || maNote>this.max);
    }

    @Override
    public String toString() {
        return "ReelContraint{" +
                "min=" + min +
                ", max=" + max +
                ", valeur=" + valeur +
                '}';
    }
}
