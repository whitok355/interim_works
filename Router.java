package interim_works;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * route
 * Маршрутизатор, выбор действия
 */
public class Router{
    
    public int routing(ArrayList<Toy> arrToys) {
        Scanner scan = new Scanner(System.in);
        Show show = new Show();

        try{
            System.out.println("\n\nЧто хотите сделать? \n0- изменить вес игрушки 1- да 2- нет 3- выход 4- показать список 5- Розыгрыш");
            int rout = scan.nextInt();
            if (rout == 0){
                RoutChangeWeight routChangeWeight = new RoutChangeWeight();
                routChangeWeight.changeWeight(arrToys, scan);
                return 1;
            } else if(rout == 1){
                RoutAdd routAdd = new RoutAdd();
                routAdd.addToy(arrToys, scan);
                return 1;
            } else if(rout == 2){
                System.out.println("Хотите посмотреть список игрушек? 1- да 2- нет");
                int rout2 = scan.nextInt();
                if(rout2 == 1){
                    show.showAll(arrToys);
                    return 1;
                } else{
                    System.out.println("Перенаправление в главное меню");
                    return 1;
                }
            } else if(rout == 3){
                RoutExit exite = new RoutExit();
                System.out.println("Было приятно с Вами играть, Ваш выигрыш\n");
                show.showFile();
                exite.exite();
                return 0;
            }else if(rout == 4){

                show.showAll(arrToys);
                return 1;
            } else if(rout == 5){
                RoutLottery routLottery = new RoutLottery();
                routLottery.startLottery(arrToys);
                return 1;
            } else{
                System.out.println("Такого маршрута не существует, укажи существующий маршрут");
                return -1;
            }
        } catch(InputMismatchException e){
            System.out.print(e + ": Необходимо ввести только числовое значение");
            return -1;
        }
    } 
}
