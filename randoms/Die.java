import java.util.*;
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{

    Random random = new Random();
   
    public int rollDie(){
        return random.nextInt(6) + 1;
    }
    public static void demo(){
        Die die = new Die();
        for(int i = 0; i<100; i++){
            System.out.println(die.rollDie());
        }
    }

}
