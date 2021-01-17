import java.util.Scanner;
import java.lang.Math;

/**
 * This program performs operations on two integers input by the user. 
 * @author Berkay Guler
 * @version 28.10.2020
*/ 
public class Lab02c
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //creating scanner object 
    
        // Variables
        int num1;
        int num2;
        int sum;
        int difference;
        int product;
        double division;
        int remainder;
        int max;
        int min;
        
        // Program Code
        System.out.println("Start...");
        
        System.out.print("Enter an integer: ");
        num1 = scan.nextInt();
        
        System.out.print("Enter another integer: ");
        num2 = scan.nextInt();
        
        //operations
        sum = num1 + num2;
        difference = num1 - num2;
        product = num1 * num2;
        division = (double)num1 / num2;
        remainder = num1 % num2;
        max = Math.max(num1, num2);
        min = Math.min(num1, num2);
        
        //output
        System.out.println("Summation = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Division = " + division);
        System.out.println("Remainder = " + remainder);
        System.out.println("Max number = " + max);
        System.out.println("Min number = " + min);
        System.out.println("End.");
        
        scan.close();
    }
    
}