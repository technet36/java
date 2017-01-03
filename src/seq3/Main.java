package seq3;


/**
 * Created by moran on 03/01/2017.
 */
public class Main {

    public static void main(String[] args){
/*test Etudiant
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
*/

        Etudiant myEtudiant = new Etudiant("mmorand","morand","maxence","29 Quai Claude Bernard, 38000 GRENOBLE","32bis route de chateauneuf, 26200 MONTELIMAR");
        System.out.println("********************");
        System.out.println("test de la classe Etudiant");
        System.out.println(myEtudiant.getNomComplet());
        System.out.print("adresseParents : ");
        System.out.println(myEtudiant.getAdresseParents());
        System.out.print("adresseEtudiant : ");
        System.out.println(myEtudiant.getAdresse());
        System.out.println(myEtudiant.getMail());
        System.out.println("********************");
/* Personne etant une classe abstraite, elle ne peut être instanciée

        Personne myPersonne = new Personne("moramaxe","morand","maxence");
        System.out.println("********************");
        System.out.println("Test de la classe Personne");
        System.out.println(myPersonne.toString());
        System.out.println(myPersonne.getMail());
        myPersonne.setAdresse("Mon adresse");
        System.out.println(myPersonne.getAdresse());
        System.out.println("********************");
*/

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


    }
}
