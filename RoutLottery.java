package interim_works;
import java.util.ArrayList;

public class RoutLottery {
    
    public void startLottery(ArrayList<Toy> arrToys){

        try{
            ArrayList<Toy> prizaToys = new ArrayList<>();

            RandomValue randomValue = new RandomValue();

            int winnerValue= randomValue.getRandomValue(0, 100);

            System.out.println("И так... начинаем розыгрыш");
            CalcRes calcRes = new CalcRes();
            calcRes.calcRes(arrToys, winnerValue);

            Toy minDifferencyToy = arrToys.get(0);

            for (int i = 1; i< arrToys.size(); i++){
                if(arrToys.get(i).getRes() <  minDifferencyToy.getRes()){
                    minDifferencyToy = arrToys.get(i);
                }

            }
            arrToys.remove(minDifferencyToy);
            System.out.println("Выигрыш добавлен в Вашу корзину");

            prizaToys.add(minDifferencyToy);

            Show show = new Show();

            WriteFile writeFile = new WriteFile();

            writeFile.writeFile(prizaToys);

            show.showAll(prizaToys);
            
        } catch (Exception e){
            System.out.println("Вы не добавили ни одной игрушки");
        }
        

    }
}
