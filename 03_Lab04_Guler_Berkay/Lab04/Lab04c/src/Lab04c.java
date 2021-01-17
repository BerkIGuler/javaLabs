/**
 * This program shows the accuracy problem computers face when using float or double due
   to the conversion between decimal and binary numbers.
 * @author Berkay Guler
 * @version 05.11.2020
*/ 
public class Lab04c
{
    public static void main(String[] args)
    {
        double d;//declaring
        d = 0.1;//initializing
        
        //program
        while ( d <  1.0 )
        {
            System.out.println( d);
            d = d + 0.1;
        }
        System.out.println( d + " <- final value after loop!");
    }    
}

