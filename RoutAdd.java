package interim_works;
import java.util.ArrayList;
import java.util.Scanner;

public class RoutAdd {

    public void addToy(ArrayList<Toy> arrToys, Scanner scan){
        RandomValue randomValue = new RandomValue();

            System.out.println("Укажите наименование: ");
            arrToys.add(
                new Toy(
                        arrToys.size(), 
                        scan.next(), 
                        randomValue.getRandomValue(1,100),  
                        randomValue.getRandomValue(1, 5),
                        0
                    )
                );
        }

}
