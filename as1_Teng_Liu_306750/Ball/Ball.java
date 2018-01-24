/**
 * Write a description of class Ball here.
 * 
 * @author (Liu Teng - 3086750) 
 * @version (Jan.20.2018)
 */
import java.util.*;

public class Ball
{
    private String color;
    private double radius;
    public static int numOfInstance;

    // getter and setter 
    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius; }

    // two Constructors for objects of class Ball
    public Ball()
    {
        color = "";
        radius = 0;
        numOfInstance++;                    // total object + 1
        System.out.println(numOfInstance);
    }

    public Ball(String color, double radius)
    {
        this.color = color;
        this.radius = radius;
        numOfInstance++;                    // total object + 1
        System.out.println(numOfInstance);
    }

    public String toString()
    {
        return "Color is "+ color + " , Radius is " + radius;
    }

    public boolean equals(Ball targetBall)
    {
        boolean isEqual = false;
        if(this.color.equals(targetBall.color) && (Math.abs(this.radius - targetBall.radius) < 0.00001))
        {
            isEqual = true;
        }
        return isEqual;
    }

    public int compareTo(Ball targetBall)
    {
        int result;         //  0 -> A=B; 
                            //  1 -> A>B; 
                            // -1 -> A<B;
        if(Math.abs(this.radius - targetBall.radius) < 0.00001)
        {
            result = 0;
        }
        else if(this.radius - targetBall.radius > 0)
        {
            result = 1;
        }
        else 
        {
            result = -1;
        }
        return result;
    }

    public double getCircum()
    {
        // 2*pi*r
        return 2*Math.PI*radius;
    }

    public double getSurface()
    {
        //  4*Pi*R2
        return 4*Math.PI*radius*radius;
    }

    public double getVolume()
    {
        // is (4/3)*Pi*R3
        return (4/3)*Math.PI*radius*radius*radius;
    }
}
