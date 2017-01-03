package seq3;

import java.util.Scanner;

/**
 * Created by moran on 03/01/2017.
 */
public class ReelContraint {
    private float min = 0;
    private float max = 20;
    private float valeur;


    public ReelContraint(float min, float max) {
        this.min = min;
        this.max = max;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }

    public void saisir() {
        Scanner entree = new Scanner(System.in);
        System.out.print("Saisir la note : ");
        int monInt ;
        monInt = entree.nextInt();
        setValeur(monInt);
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
