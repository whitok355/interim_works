package interim_works;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Show {

    public void showAll(ArrayList<Toy> arrToys){
        for(Toy toy: arrToys){
            System.out.println(toy.toString());
        }
    }

    public void showFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("список призов.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException e){
            System.out.println(e + "Невозможно прочитать указанный файл");
        }
    }

}
