package interim_works;
import java.util.Random;

/**
 * randomWeight
 */
public class RandomValue {

    public int getRandomValue(int min, int max){
        return new Random().nextInt(min,max);
    }
}