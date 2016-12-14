package seq1;

/**
 * Created by moran on 13/12/2016.
 */
public class Triangle {
    private int longueur;


    public Triangle(int val) {
        //afficheLigne(3);
        longueur = val;
    }


    private void afficheLigne(int val) {
// {} => {affiche une ligne comportant val caractères *}
        while(val>0){
            val--;
            System.out.print('*');
        }
        System.out.println();
    }

    public void demiTriangleIsocele(){
        for (int i =1;i<=this.longueur;i++)
            afficheLigne(i);

    }

    public void triangleIsocele(){
        int a =1;
        for(int i=1;i>0;i+=a){
            afficheLigne(i);
            if (i==this.longueur)
                a=-1;
        }
    }

}
