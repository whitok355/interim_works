package interim_works;
import java.io.File;

public class Cleaner {

    public void cleaner(){

        try{
            File f = new File("список призов.txt");
            f.delete();
        } catch (Exception e){
            System.out.println(e + "Файл список призов.txt не найден, поэтому его невозможно удалить");
        }
    }


}
