package seq3;


/**
 * Created by moran on 03/01/2017.
 */
public class Main {

    public static void main(String[] args){

        Etudiant myEtu = new Etudiant("mmorand","morand","maxence");
        System.out.println(myEtu.toString());
        System.out.println("*********************");
        System.out.println(myEtu.getLogin());
        System.out.println(myEtu.getPrenom());
        System.out.println(myEtu.getNom());
        System.out.println(myEtu.getAdresse());
        System.out.println(myEtu.getMail());
        System.out.println(myEtu.getNomComplet());
        System.out.println("*********************");
        myEtu.setLogin("moramaxe");
        System.out.println(myEtu.getLogin());
        myEtu.setAdresse("29 Quai Claude Bernard, 38000 GRENOBLE");
        System.out.println(myEtu.getAdresse());






    }
}
