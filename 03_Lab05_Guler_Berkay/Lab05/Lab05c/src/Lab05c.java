import java.util.Scanner;

/** This is a simple calculator program.
 * @author Berkay Guler
 * @version 24.11.2020
 */

public class Lab05c
{
    public static void main(String[] args)
    {
        // create a scanner object
        Scanner scan = new Scanner(System.in);
        
        // variables
        double operand;
        String operation;
        double accumulator;
        double number;
        
        
        System.out.println("Welcome to \"SimpleCalc\"...");
        
        // initialize accumulator to 0 and start the calc. program
        accumulator = 0.0;
        do {
            // display program menu and get input
            System.out.println("\n---------------\n[ " + accumulator + " ]\n---------------");
            System.out.println("+,-,*,/ value\nClear\nQuit\n---------------");
            System.out.print("Select: ");
            operation = scan.nextLine();
            
            // clear the accumulator
            if (operation.charAt(0) == 'c' || operation.charAt(0) == 'C')
            {
                accumulator = 0.0;
            }
            
            // performing a chosen operation
            else
            {
                if (!(operation.charAt(0) == 'q' || operation.charAt(0) == 'Q'))
                {
                    operand = operation.charAt(0);
                    number = Double.parseDouble(operation.substring(2, (operation.length())));
                    
                    if (operand == '+')
                    {
                        accumulator = accumulator + number;
                    }
                    
                    else if (operand == '-')
                    {
                        accumulator = accumulator - number;
                    }
                    
                    else if (operand == '*')
                    {
                        accumulator = accumulator * number;
                    }
                    
                    else if (operand == '/')
                    {
                        accumulator = accumulator / number;
                    }
                }                    
            }                
        } while (!(operation.charAt(0) == 'q' || operation.charAt(0) == 'Q'));
        
        System.out.println("\nThanks for using \"SimpleCalc\", goodbye.");
        scan.close();
       
    }    
}            