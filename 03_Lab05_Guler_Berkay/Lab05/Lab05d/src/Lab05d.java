import java.util.Scanner;
import java.lang.Math;

/** This program calculates the value of pi
 * in 3 different ways
 * @author Berkay Guler
 * @version 23.11.2020
 */
public class Lab05d
{
    public static void main(String[] args)
    {
        // creating scanner object
        Scanner scan = new Scanner(System.in);
    
        // variables
        int numTerms;
        double pi;
        double sumOfSeries;
        int counter;
        double currentTerm;
        double precision;
        
        // Using Math to calculate pi
        pi = Math.PI;
        System.out.print("Value of pi = " + pi);
        
        // using series to approximate pi
        System.out.print("\n\nEnter the number of terms in the series: ");
        numTerms = scan.nextInt();
        
        // Approximating to pi with a given number of terms
        sumOfSeries = 0;
        for (counter = 1; counter <= numTerms; counter = counter + 1)
        {   
            // check if the terms must be positive
            if (counter % 2 == 1)
            {    
                currentTerm = 4 / ((double) ((2 * counter) - 1));
            }
            else
            {
                currentTerm =  - 4 / ((double) ((2 * counter) - 1));
            }        
            sumOfSeries = sumOfSeries + currentTerm;
        }
        System.out.println("Value of PI approximated by " + numTerms + " terms = " + sumOfSeries);
        
        
        // Approximating pi to a given precision
        sumOfSeries = 0;
        System.out.print("\nEnter the precision up to which you want to calculate pi: ");
        precision = scan.nextDouble();
        for (counter = 1; Math.abs(sumOfSeries - Math.PI) > precision; counter = counter + 1)
        {   
            // check if the terms must be positive
            if (counter % 2 == 1)
            {    
                currentTerm = 4 / ((double) ((2 * counter) - 1));
            }
            else
            {
                currentTerm =  - 4 / ((double) ((2 * counter) - 1));
            }
            sumOfSeries = sumOfSeries + currentTerm;
        }
        System.out.println("Value of PI to an error of %" + precision + " = " + sumOfSeries);
        
        // closing the scan
        scan.close();   
    }    
}        
        
        
