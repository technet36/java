package seq4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by moran on 10/01/2017.
 */
public class Main {
    public static void main (String[] args) {
        ArrayList<Integer> alInteger = new ArrayList<>();
        alInteger.add(54);
        alInteger.add(24);
        alInteger.add(12);
        alInteger.add(0,12);
        alInteger.remove(3);
        System.out.println("La taille du tableau est : "+alInteger.size());
        System.out.println("Le contenu du tableau est :"+alInteger.toString());
        Collections.sort(alInteger);
        System.out.println("Le contenu du tableau est :"+alInteger.toString());


        ArrayList<String> alString = new ArrayList<>();
        alString.add("une");
        alString.add("phrase");
        alString.add(0,"ceci");
        alString.add(1,"est");
        System.out.println(alString);

    }

}
