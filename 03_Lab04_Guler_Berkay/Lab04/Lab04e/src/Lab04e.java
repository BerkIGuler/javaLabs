import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * This program reads integer from a file and find the average, max
 * and the min of these values. 
 * @author Berkay Güler
 * @version 19.11.2020
*/ 

public class Lab04e
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //creating scanners
        Scanner scan = new Scanner(System.in);
        Scanner dataInputFile = new Scanner( new File( "testFile.txt") );
        
        //constants
        final int NUM_TO_READ = 100;
        
        //variables
        int sum;
        int counter;
        int number;
        int max;
        int min;
        double average;
        
        
        // Initializing the counter, sum, min, and max
        counter = 0;
        sum = 0;
        max = dataInputFile.nextInt();
        min = max;
        //reading the numbers and finding min, max, average
        while (NUM_TO_READ > counter)
        {
            number = dataInputFile.nextInt();
            sum = sum + number;
            counter = counter + 1;
            
            if (number > max)
            {
                max = number;
            }
            
            if (number < min)
            {
                min = number;
            }       
        }
        average = sum / (double) NUM_TO_READ;
        
        // Output 
        System.out.println("\nThe sum of the the integers read is " + sum +
                           "\nThe number of integers read is " + counter +
                           "\nAverage of of the first " + NUM_TO_READ + " value is " + average + 
                           "\nMinimum of the first " + NUM_TO_READ + " value is " + min +
                           "\nMaximum of the first " + NUM_TO_READ + " value is " + max);         
        //closing the scanner objects                   
        scan.close();   
        dataInputFile.close();
    }    
}
            
            
        

        