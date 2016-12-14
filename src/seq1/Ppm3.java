package seq1;

import java.util.Scanner;

/**
 * Created by moran on 13/12/2016.
 */
public class Ppm3{
    public Ppm3(int monInt) {

           System.out.println("Le plus proche multiple de trois est : " +ppm3(monInt));
    }

    private static int ppm3(int val) {
// {} => {résultat = plus proche multiple de 3 de val}
        if(val % 3 == 1) {
            val = val - 1;
        }
        else if (val % 3 == 2) {
            val = val + 1;
        }
        return val;
    }





}
