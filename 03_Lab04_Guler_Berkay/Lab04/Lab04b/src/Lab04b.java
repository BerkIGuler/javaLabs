import java.util.Scanner;

/**
 * This program draws patterns using while loops.
 * @author Berkay Guler
 * @version 05.11.2020
*/ 
public class Lab04b
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //declaration
        char ch; 
        int width;
        int counter;
        int counter2;
        
        //first part
        //input
        System.out.print("Enter a character: "); 
        ch = scan.next().charAt(0);
        System.out.print("Enter an integer to be used as width: ");
        width = scan.nextInt();
        
        //counter initialization
        counter = 1;
        counter2 = 1;
        
        //program
        //drawing the patterns
        while (counter <= width) 
        {
            while (counter2 <= counter )
            {
                System.out.print(ch);
                counter2 ++;
            }
            System.out.println();
            counter ++;    
            counter2 = 1;
        }    
        
        //second part
        //input
        System.out.print("\n\n\nEnter another character: ");
        ch = scan.next().charAt(0);
        System.out.print("Enter another integer to be used as base: ");
        width = scan.nextInt();
        
        //counter initialization
        counter = width;
        counter2 = 1;
        
        //program
        //drawing the patterns
        while (counter >= 1)
        {
            while (counter2 <= counter )
            {
                System.out.print(ch);
                counter2 ++;
            }
            System.out.println();
            counter --;    
            counter2 = 1;
        }   
    }    
}

