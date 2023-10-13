package interim_works;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteFile {
    
    public void writeFile(ArrayList<Toy> prizaToys){
        try(FileWriter fw = new FileWriter("список призов.txt", true)){

            for(Toy toy: prizaToys){
                fw.write(toy.toString()+ "\n");
            }
        } catch(IOException e){
            System.out.println(e + ": не удалось аписать информацию о призах в файл");
        }
    }
}
