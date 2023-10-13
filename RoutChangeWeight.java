package interim_works;
/**
 * RoutChangeWeight
 */
import java.util.ArrayList;
import java.util.Scanner;

public class RoutChangeWeight {

    public void changeWeight(ArrayList<Toy> arrToys, Scanner scan){

        try {
            if(arrToys.size() == 0){
                System.out.print("Вы еще не добавили игрушки");
            } else{
                RandomValue randValue = new RandomValue();
                System.out.print("Укажите id игрушки у которой Вы хотите узменить частоты выпадения (вес)");
                int id = scan.nextInt();
                Toy findToy = arrToys.get(id);
                System.out.print(findToy);
                findToy.setWeight(randValue.getRandomValue(1, 100));
            }
        } catch (Exception e){
            System.out.println(e + ": Ошибка при изменение веса игрушки");
        }

    }
}