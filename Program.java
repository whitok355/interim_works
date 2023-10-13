package interim_works;
import java.io.IOException;
import java.util.ArrayList;
/**
 * program
 * Основной класс
 * Из данного класса вызывается маршрутизатор
 */
public class Program {

    public static void main(String[] args) throws IOException{    
        Router router = new Router();
        Boolean flag = true;
        ArrayList<Toy> arrToys = new ArrayList<>();
        Cleaner cleaner = new Cleaner();
        cleaner.cleaner();
        
        while(flag){
            int res = router.routing(arrToys);

            if(res == 0){
                break;
            } else if(res < 0){
                res = router.routing(arrToys);
            }
    
        }
            
    }

}