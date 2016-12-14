package seq1;

import java.util.Scanner;

/**
 * Created by moran on 13/12/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);
        System.out.print("Saisir un entier : ");
        int monInt ;
        monInt = entree.nextInt();

        //new Ppm3();
        Triangle monTriangle = new Triangle(monInt);
    }
}
