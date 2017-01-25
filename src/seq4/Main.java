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
        /*
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
        */
        TestEtudiant();
        //TestPolymorphismePersonne();

    }

    public static void TestEtudiant() {
        //Création d'un étudiant et test
        Etudiant myEtudiant = new Etudiant("mmorand","morand","maxence","29 Quai Claude Bernard, 38000 GRENOBLE","32bis route de chateauneuf, 26200 MONTELIMAR");
        System.out.println("********************");
        System.out.println("test de la classe Etudiant");
        System.out.println(myEtudiant.getNomComplet());
        System.out.print("adresseParents : ");
        System.out.println(myEtudiant.getAdresseParents());
        System.out.print("adresseEtudiant : ");
        System.out.println(myEtudiant.getAdresse());
        System.out.println(myEtudiant.getMail());
        myEtudiant.addNote(17);
        myEtudiant.addNote(16);
        myEtudiant.addNote(12.335f);
        System.out.println("Bulletin : "+myEtudiant.getNotes());
        System.out.println("Moyenne : "+myEtudiant.getMoyenne().getValeur());

        System.out.println("********************");
    }

    public static void TestPolymorphismePersonne(){
        ArrayList<Personne> mesPersonnes = new ArrayList<>();

        Etudiant etu1 = new Etudiant("mmorand","morand","maxence","29 Quai Claude Bernard, 38000 GRENOBLE","32bis route de chateauneuf, 26200 MONTELIMAR");
        Etudiant etu2= new Etudiant("toto","noName","noToto");
        Etudiant eut3= new Etudiant("test","xxX_KEVIN_DU_26_Xxx","xXtestXx");


        Personnel prof1 = new Personnel("BLANCHON","RV","hblanchon","ma Rue 12345 MA VILLE");
        Personnel prof2 = new Personnel("jean","Dupont","JD","ma Rue 12345 NOWHERE");
        Personnel prof3 = new Personnel("jacques","jean","JJ","ma Rue 12345 AuMilieuDeRien");

        System.out.print("\nPersonnes well created\n");

        mesPersonnes.add(etu1);
        mesPersonnes.add(etu2);
        mesPersonnes.add(eut3);
        mesPersonnes.add(prof1);
        mesPersonnes.add(prof2);
        mesPersonnes.add(prof3);

        System.out.print("\nPersonnes added\n");

        for (Personne personne:mesPersonnes)
            System.out.print("*********\n"+personne.getNomComplet()+"\nMail:"+personne.getMail()+"\n");

    }

}
