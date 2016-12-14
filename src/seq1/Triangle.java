package seq1;

/**
 * Created by moran on 13/12/2016.
 */
public class Triangle {


    public Triangle(int val) {
        //afficheLigne(3);
        demiTriangleIsocele(val);
    }

    private static void afficheLigne(int val) {
// {} => {affiche une ligne comportant val caractères *}
        while(val>0){
            val--;
            System.out.print('*');
        }
        System.out.println();
    }

    private static void demiTriangleIsocele(int val){
        for (int i =1;i<=val;i++)
            afficheLigne(i);

    }

}
