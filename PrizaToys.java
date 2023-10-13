package interim_works;
import java.util.ArrayList;

/**
 * PrizaToys
 */
public class PrizaToys {

    private ArrayList<Toy> arrPrizaToy;

    public PrizaToys(){}
    
    public PrizaToys(ArrayList<Toy> arrPrizaToy){
        this.arrPrizaToy = arrPrizaToy;
    }


    public ArrayList<Toy> getArrPrizaToy(){
        return arrPrizaToy;
    }

    public void addInArrPrizaToy(Toy toy){
        arrPrizaToy.add(toy);
    }

    public Toy findArrPrizaToy(int id){
        return arrPrizaToy.get(id);
    }

    public void delInArrPrizaToy(int id){
        arrPrizaToy.remove(id);
    }

}