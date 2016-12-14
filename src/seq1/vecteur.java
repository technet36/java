package seq1;

import java.util.Arrays;

/**
 * Created by moran on 14/12/2016.
 */
public class Vecteur {

    private int myTab[];
    private int size;

    public Vecteur(int[] myTab) {
        this.myTab = myTab;
    }

    public Vecteur(int size) {
        this.size = size;
        this.myTab = new int[size];
    }

    public void setMyTab() {
       // int tab[] = {1,5,6,8,9,4,3};
       // this.myTab = tab;

        for(int i=0;i<this.size;i++)
            this.myTab[i]= (int)(Math.random()*100);
    }

    @Override
    public String toString() {
        return "Vecteur{" +
                "myTab=" + Arrays.toString(myTab) +
                '}';
    }

    public int search(int val){
        for (int i =0;i<this.size;i++){
            if (myTab[i]==val)
                return i;
        }
        return -1;
    }

    public int max(){
        int max = 0;
        for (int aMyTab : this.myTab) {
            if (aMyTab > max)
                max = aMyTab;
        }
        return max;
    }
}
