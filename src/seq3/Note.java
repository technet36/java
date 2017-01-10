package seq3;

/**
 * Created by moran on 04/01/2017.
 */
public class Note extends ReelContraint{

    public Note(float note) {
        super(0,20);
        setValeur(note);
    }
    public Note(){
        super(0,20);
    }
}
