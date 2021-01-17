import java.util.Scanner;

/**
 * This program reads and integer and experiments with while loops. 
 * @author Berkay Guler
 * @version 05.11.2020
*/ 

public class Lab04a
{
    public static void main( String[] args)
    {
        Scanner scan = new Scanner( System.in);
        //variable declaration
        int number;
        int counter;
        int counter2;
        
        //input
        System.out.print( "Enter a positive integer: ");
        number = scan.nextInt();
        //counter initialization
        counter = 0;
        counter2 = 0;
        
        //validation
        if ( number < 0)
        {
            System.out.println( "Oops, invalid input\nExiting...");
        }
        else
        {
            //program
            //first part
            System.out.println( "\nInteger values from 0 up to " + number + " exclusive:");
            while ( counter < number)
            {
                System.out.print( counter + " ");
                counter ++;
            }
            
            //first part
            System.out.println( "\n\ninteger values from 0 up to " + number + " exclusive, 5 numbers in a row:");
            counter = 1;
            while( counter < number)
            {
                System.out.print( counter + " ");
                counter ++;
                counter2 ++;
                if ( counter2 % 5 == 0)
                {
                    System.out.println();
                }    
            }
            
            //second part
            System.out.println( "\n\ninteger values from " + number + " to 0 inclusive:");
            counter = number;
            while ( counter >= 0)
            {
                System.out.print(counter + " ");
                counter --;
            }
            
            //third part
            System.out.println( "\n\neven integer values from -" + number + " to " + number + ":");
            counter = - number;
            while ( counter <= number)
            {   
                if ( counter % 2 == 0)
                {
                    System.out.print(counter + " ");
                }    
                counter ++;
            }
            
            //fourth part
            System.out.println( "\n\nthe squares of the even values from 0 up to " + number + ":" );
            counter = 0;
            counter2 = 0;
            while ( counter <= number)
            {   
                if ( counter % 2 == 0)
                {
                    System.out.print(counter * counter + " ");
                    counter2 ++;
                    if (counter2 % 5 == 0)
                    {
                        System.out.println();
                    }
                }    
                counter ++;    
            }
            
            //fifth part
            System.out.println( "\n\nthe values which are divisible by 3 or 4, but not both, from " + number + " down to 3 inclusive:" );
            counter = number;
            counter2 = 0;
            while ( counter >= 3)
            {   
                if ( (counter % 3 == 0 || counter % 4 == 0) & !( counter % 12 == 0) )
                {
                    System.out.print(counter + " ");
                    counter2 ++;
                    if (counter2 % 5 == 0)
                    {
                        System.out.println();
                    }
                }    
                counter --;    
            }
            
            //sixth part
            System.out.println( "\n\nAll of the divisors of " + number + ":" );
            counter = 1;
            while ( counter <= number)
            {   
                if ( number % counter == 0 )
                {
                    System.out.print(counter + " ");
                }    
                counter ++;    
            }        
        }            
    }
}




