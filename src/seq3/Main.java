package seq3;


/**
 * Created by moran on 03/01/2017.
 */
public class Main {

    public static void main(String[] args){

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
        myEtudiant.addNote();
        myEtudiant.addNote();
        myEtudiant.addNote();
        System.out.println("Bulletin : "+myEtudiant.getBulletin());
        System.out.println("Moyenne : "+myEtudiant.getMoyenne());

        System.out.println("********************");
/*
        //Création d'un prof et test
        Personnel myProf = new Personnel("BLANCHON","RV","hblanchon","ma Rue 12345 MA VILLE");
        System.out.println("********************");
        System.out.println(myProf.toString());
        myProf.setEchelon(1000);
        myProf.setValeurPointIndice(1.3f);
        System.out.println(myProf.getNomComplet());
        System.out.println(myProf.getMail());
        System.out.println(myProf.getEchelon());
        System.out.println(myProf.getValeurPointIndice());
        System.out.print("Salaire : ");
        System.out.println(myProf.getSalaire()+" €");
        System.out.println("********************");
*/



    }
}
