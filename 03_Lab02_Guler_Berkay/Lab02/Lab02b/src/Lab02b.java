import java.util.Scanner;

/**
 * This program prints a personalized message.
 * @author Berkay Guler
 * @version 27.10.2020
*/ 
public class Lab02b
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in); //creating Scanner object
    
        String name; //variable declaration
        
        //output
        System.out.println("Start...");
        System.out.print("Enter your name:");
        name = scan.next(); //input
        
        System.out.println("Hello " + name + " Welcome to Lab02b...");
        
        System.out.println("End.");
        scan.close();
    }
    
}