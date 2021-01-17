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

public class Lab04d
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Creating the Scanner object
        Scanner scan = new Scanner(System.in);
        
        //variables
        int numOfValues;
        String fileName;
        int counter;
        int randInt;
        
        //Inputting file name and number of values
        System.out.print("Enter the file name: ");
        fileName = scan.nextLine();
        
        System.out.print("Enter the number of values: ");
        numOfValues = scan.nextInt();

        //Creating a PrintWriter object
        PrintWriter fout = new PrintWriter( fileName + ".txt");
        
        //initalizing counter as 0 and generating and saving the values to a file
        counter = 0;
        while (counter < numOfValues)
        {
            randInt = (int) (Math.random() * 1000);
            fout.println(randInt);
            counter = counter + 1;
        }
        
        //closing the file and scanner
        fout.close();
        scan.close();
    }
}       

        

