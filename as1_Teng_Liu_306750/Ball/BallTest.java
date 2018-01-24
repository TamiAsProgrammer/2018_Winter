/**
 * Write a description of class BallTest here.
 * 
 * @author (Liu Teng - 3086750) 
 * @version (Jan.20.2018)
 */
import java.util.*;

public class BallTest
{
    public static void main(String[] args)
    {
        System.out.println("\n-------1. Initial Balls----------------");

        Ball b0 = new Ball("Red", 4.6);         // b0, b1 equals
        Ball b1 = new Ball("Red", 4.6);
        Ball b2 = new Ball("Green", 8.0);
        Ball b3 = new Ball();                   // use b3 for testing the set methods
        b3.setColor("Blue");
        b3.setRadius(10.0);

        System.out.println("\n-------2. Display Balls----------------");
        System.out.println("b0:  " + b0.toString());
        System.out.println("b1:  " + b1.toString());
        System.out.println("b2:  " + b2.toString());
        System.out.println("b3:  " + b3.toString());
        System.out.println("total: " + Ball.numOfInstance);             // total ball objects

        System.out.println("\n-------3. Testing Ball functions-------");
        System.out.println("b0 equals b1?  " + b0.equals(b1));          // equals testing
        System.out.println("b1 equals b2?  " + b1.equals(b2));

        int compare = b2.compareTo(b3);                                 // compareTo testing
        System.out.print("b2 compareTo b3:  ");
        if(compare == 0)
        {
            System.out.println("b2 = b3");
        }
        else if(compare > 0)
        {
            System.out.println("b2 > b3");
        }
        else
        {
            System.out.println("b2 < b3");
        }

        // circumference, surface, volume testing
        System.out.println();                                           
        System.out.println("b2 circumference:  " + b2.getCircum());     
        System.out.println("b2 surface:  " + b2.getSurface());
        System.out.println("b2 volume:  " + b2.getVolume());

    }
}
