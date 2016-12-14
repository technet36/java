package seq1;

import java.util.Scanner;

/**
 * Created by moran on 13/12/2016.
 */
public class Main {
    public static void main(String[] args) {
       //**********************
       Scanner entree = new Scanner(System.in);
       System.out.print("Saisir un entier : ");
       int monInt ;
       monInt = entree.nextInt();
       //**********************


        //*************
        //new Ppm3();
        //*************

        //******************
        //Triangle monTriangle = new Triangle(monInt);
        //monTriangle.demiTriangleIsocele();
        //monTriangle.triangleIsocele();
        //******************

        //******************

        Vecteur monVecteur = new Vecteur(monInt);
        monVecteur.setMyTab();
        System.out.println(monVecteur.toString());
        System.out.println(monVecteur.max());


        System.out.println("Quelle valeur voulez vous chercher ?");
        int val =entree.nextInt();
        int i = monVecteur.search(val);
        String recherche = (i!=-1)?("L'élément "+val+" est present à l'indice "+i):("L'element "+val+" n'est pas présent.");
        System.out.println(recherche);
    }
}
