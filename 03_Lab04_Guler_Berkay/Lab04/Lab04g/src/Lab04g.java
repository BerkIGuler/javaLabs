import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * This program calculates min, max, and average values for the 
 * numbers from a txt file, it stops when it reaches a negative number
 * @author Berkay Guler
 * @version 19.11.2020
*/ 
public class Lab04g
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //creating Scanner objects
        Scanner scan = new Scanner(System.in);
        Scanner dataInputFile = new Scanner( new File( "ntestFile2.txt") );
        
        
        //variables
        int sum;
        int counter;
        int number;
        int max;
        int min;
        double average;
        
        
        //initializing variables and processing with the numbers read
        counter = 0;
        sum = 0;
        max = dataInputFile.nextInt();
        min = max;
        number = max;
        while (number > 0)
        {

            if (number > max)
            {
                max = number;
            }
            
            if (number < min)
            {
                min = number;
            }     
            
            sum = sum + number;  
            
            //incrementing the counter and read the next integer
            counter = counter + 1;
            number = dataInputFile.nextInt();
            
        }
        //calcuting the average
        average = sum / (double) counter;
        
        //reporting the results
        System.out.println("\nThe sum of the the integers read is " + sum +
                           "\nThe number of integers read is " + counter +
                           "\nAverage of of the first " + counter + " value is " + average + 
                           "\nMinimum of the first " + counter + " value is " + min +
                           "\nMaximum of the first " + counter + " value is " + max);        
                            
        //closing the scanners                   
        scan.close();      
        dataInputFile.close();             
    }    
}
