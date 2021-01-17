import java.io.PrintWriter;
import java.lang.Math;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * This program inputs the file name and number of random values
 * to be generated and creates an output file.
 * @author Berkay Guler
 * @version 18.11.2020
 */

public class Lab04f
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //Scanner object   
        Scanner scan = new Scanner(System.in);
        
        //variables
        int numOfValues;
        String fileName;
        int counter;
        int randInt;
        int decision;
        int location;
        int numOfNegative;
        double probability;
        
        //Inputting file name and number of values
        System.out.print("Enter the file name: ");
        fileName = scan.nextLine();
        
        System.out.print("Enter the number of values: ");
        numOfValues = scan.nextInt();
        
        System.out.print("Put -1 to a specified location ---> enter 1 " +
                         "\nPut several negative values at random " +
                         "locations throughout the file ---> enter 2: ");
        decision = scan.nextInt();
        
        //Creating a PrintWriter object
        PrintWriter fout = new PrintWriter( fileName + ".txt");
        
        // inserting -1 to the desired location and generating random integers
        if (decision == 1)
        {
            System.out.print("Enter the location where you want to put a -1: ");
            location = scan.nextInt();
            
            //initalizing counter as 1 and creating and saving the values to a file
            counter = 1;
            while (counter <= numOfValues)
            {
                randInt = (int) (Math.random() * 1000);
                
                if (location != counter)
                {
                    fout.println(randInt);
                }
                else
                {
                    fout.println(-1);
                }        
                //incrementing the counter
                counter = counter + 1;
            }
        }  
        // Inserting desired number of negative integers and generating numbers 
         else if (decision == 2)
         {
            System.out.print("How many negative values do you want to insert?: ");
            numOfNegative = scan.nextInt();
            probability = numOfNegative / (double) numOfValues;
            
            //initalizing counter as 1 and creating and saving the values to a file
            counter = 1;
            while (counter <= numOfValues)
            {
                randInt = (int) (Math.random() * 1000);
                
                if (numOfNegative > 0 && randInt < 1000 * probability)
                {
                    randInt = - randInt;
                    numOfNegative = numOfNegative - 1;
                }
                fout.println(randInt);
                       
                counter = counter + 1;
            }
         }    
        //closing the file and Scanner object    
        fout.close();
        scan.close();
    }
}      