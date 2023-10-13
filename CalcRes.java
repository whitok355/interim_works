package interim_works;
import java.util.ArrayList;

public class CalcRes {
    public void calcRes(ArrayList<Toy> arrToys, int winnerValue){
        for(Toy toy: arrToys){
            int res = winnerValue - toy.getWeight();
            if(res < 0){
                toy.setRes(Math.abs(res));
            } else {
                toy.setRes(res);
            }
        }
    }
}
