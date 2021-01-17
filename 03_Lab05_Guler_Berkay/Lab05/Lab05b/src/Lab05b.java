import java.util.Scanner;

/**This program prints tables in different format
 * @author Berkay Guler
 * @version 24.11.2020
 */

public class Lab05b
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
         
        // variables
        int numRows;
        int numCols;
        int rowCounter;
        int colCounter;
        int counter;
        String currentCell;
         
        // ask & get number of cols and rows from the user
        System.out.print("Enter the number of rows: ");
        numRows = scan.nextInt();
        System.out.print("Enter the number of columns: ");
        numCols = scan.nextInt();
         
        System.out.println("\n"); 
            
        // print the first table
        for (rowCounter = 1; rowCounter <= numRows; rowCounter = rowCounter + 1)
        {
            for (colCounter = 1; colCounter <= numCols; colCounter = colCounter + 1)
            {   
                // the row & column numbers as shown in the example
                currentCell = rowCounter + "," + colCounter;
                for (counter = 0; currentCell.length() < 7; counter = counter + 1)
                {
                    currentCell = " " + currentCell;
                }    
                System.out.print(currentCell);
            }
            System.out.println();
        }    
         
        System.out.println("\n");

        // print the second table
        for (rowCounter = 1; rowCounter <= numRows; rowCounter = rowCounter + 1)
        {
            for (colCounter = 1; colCounter <= numCols; colCounter = colCounter + 1)
            {   
                // the product of the row & column number (a multiplication table!)
                currentCell = "" + (rowCounter * colCounter);
                for (counter = 0; currentCell.length() < 7; counter = counter + 1)
                {
                    currentCell = " " + currentCell;
                }    
                System.out.print(currentCell);
            }
            System.out.println();
        }
         
        System.out.println("\n");
         
        // print the third table
        for (rowCounter = 1; rowCounter <= numRows; rowCounter = rowCounter + 1)
        {
            for (colCounter = 1; colCounter <= numCols; colCounter = colCounter + 1)
            {   
                // Cells only include cell number
                currentCell = "" + (4 * rowCounter + colCounter - 5);
                for (counter = 0; currentCell.length() < 7; counter = counter + 1)
                {
                    currentCell = " " + currentCell;
                }    
                System.out.print(currentCell);
            }
            System.out.println();
        }   
        
        System.out.println("\n");
        
        // print the fourth table
        for (rowCounter = 1; rowCounter <= numRows; rowCounter = rowCounter + 1)
        {
            for (colCounter = 1; colCounter <= numCols; colCounter = colCounter + 1)
            {   
                // Row numbers are displayed only in first column
                if (colCounter == 1)
                {
                    currentCell = "" + rowCounter;
                }    
                else
                {
                    currentCell = "-";
                }    
                for (counter = 0; currentCell.length() < 7; counter = counter + 1)
                {
                    currentCell = " " + currentCell;
                }    
                System.out.print(currentCell);
            }
            System.out.println();
        }
        scan.close();
    }
}        