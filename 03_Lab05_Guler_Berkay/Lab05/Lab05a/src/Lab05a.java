import java.util.Scanner;

/** This program inputs 3 different integers and draws
 * wall patterns using for loops
 * @author Berkay Guler
 * @version 22.11.2020
 */

public class Lab05a
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        
        //variables
        int height;
        int width;
        int thickness;
        int countRow;
        int countCol;
        Boolean holeFound;
        String morePatterns;
        
        do
        {
            //input 
            System.out.print("Enter width, height & thickness: ");
            width = scan.nextInt();
            height = scan.nextInt();
            thickness = scan.nextInt();
        
            //validation of inputs
            if (width <= 0 || height <= 0 || thickness <= 0)
            {
                System.out.println("All values must be positive");
            }    
            //program to draw patterns
            else
            {   
                //initalize flag variable
                holeFound = false;
                // counter loop for row index
                for (countRow = 0 ; countRow < height; countRow = countRow + 1)
                {   
                    //counter loop for column index
                    for (countCol = 0 ; countCol < width; countCol = countCol + 1)
                    {   
                        //checking if there are holes
                        if (countRow >= thickness && countRow <= (height - thickness - 1) &&
                            countCol >= thickness && countCol <= (width - thickness - 1))
                        {
                            System.out.print("   ");
                            holeFound = true;
                        }    
                        else
                        {
                            System.out.print(" * ");
                        }    
                    }
                    //Continuing on the new line
                    System.out.println();
                }
                 
                if (holeFound == false)
                {
                    System.out.println("Oops... no hole!");
                }       
            
            }     
            // asking the user whether to continue the program
            System.out.print("Do you want to create more patterns?(Type 'Y' or 'y' for yes): ");
            scan.nextLine();
            morePatterns = scan.nextLine();        
        } while (morePatterns.equals("y") || morePatterns.equals("Y"));
    }   
}    
      