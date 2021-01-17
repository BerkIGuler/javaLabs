import java.util.Scanner;
import java.lang.Math;

/**
 * This program calculates the number of flowers that can be planted in a triagle shaped area.
 * @author Berkay Güler
 * @version 28.10.2020
*/ 
public class Lab02d
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        // Constants
        final int maxFlowersPerUnit = 17;
        // Variables
        double side1; double side2; double side3; double halfPerimeter; double area;
        int numberOfFlowers;
        
        //input
        System.out.print("Enter the lenght of side 1: ");
        side1 = scan.nextDouble();
        System.out.print("Enter the lenght of side 2: ");
        side2 = scan.nextDouble();
        System.out.print("Enter the lenght of side 3: ");
        side3 = scan.nextDouble();
        
        //operations
        halfPerimeter = (side1 + side2 + side3) / 2;
        area = Math.sqrt( halfPerimeter * (halfPerimeter - side1) * (halfPerimeter - side2) * (halfPerimeter - side3));
        numberOfFlowers = (int) (area * maxFlowersPerUnit);
        
        //output
        System.out.println("Max number of flowers that can be planted is " + numberOfFlowers);
        System.out.println("End.");
        scan.close();
    }
    
}