
/**
 * Write a description of class Die here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Random;
public class Die
{
    Random rand = new Random ();
    int n;
public void roll(){
n = rand.nextInt(6)+1;
}
public int getNumDots(){
return this.n;
}
}
