import java.util.Scanner;
import java.lang.Math;

/** This program defines several methods and experiments with them
 *  @author Berkay Guler
 *  @version 29.11.20
 */
public class Lab06a
{
    /** This method returns x to the power y
     * @param x double base
     * @param y int power
     * @return double x to the power y
     */
    public static double power(double x, int y)
    {
        double result;

        result = 1;
        while (y > 0)
        {
            result = result * x;
            y = y - 1;
        }
        return result;
    }  
    
    
    /** This method returns n!
     * @param n int number to calculate its factorial
     * @return int factorial of n
     */
    public static long factorial(int n)
    {
        long result;
        int counter;
        
        result = 1;
        for(counter = n; counter > 0; counter = counter - 1)
        {
            result = result * counter;
        }
        return result;
    } 
    
    
    /** This method reverses the given string and returns it
     * @param s String string to be reversed
     * @return String reversed string
     */
    public static String reverse(String s)
    {
        String result;
        int i;
        
        result = "";
        for (i = 0; i < s.length(); i = i + 1)
        {
            result = s.charAt(i) + result;
        }    
        return result;
    } 
    
    
    /** This method converts a base 2 binary number to decimal and returns it
     * @param base2 String any binary number
     * @return int decimal equivalent of base2
     */
    public static int toDecimal( String base2)
    {   
        int index;
        double valueOfDigit;
        String digit;
        double dDigit;
        int result;
         
        result = 0;
        for (index = 0; index < base2.length(); index = index + 1)
        {
            digit = "" + (reverse(base2)).charAt(index);
            dDigit = Double.parseDouble(digit);
            valueOfDigit = (power(2, index) * dDigit);
            result = result + (int) valueOfDigit;
        }
        return result;    
    } 
    
    
    /** This method converts a decimal to binary and returns it
     * @param dec is a positive integer
     * @return String binary represantation of dec
     */
    public static String decToBin( int dec)
    {   
        int quotient;
        int digit;
        String result;
        
        result = "";
        if (dec == 0)
        {
            return "0";
        }
        else
        {    
            
            while (dec > 0)
            {
                quotient = dec / 2;
                digit = dec % 2;
                result = digit + result;
                dec = quotient;
            }    
            return result;   
        }    
    } 
    
    
    /** This method returns sin(x)
     * @param x double in radians to calculate sin
     * @return double sin(x)
     */
    public static double sin(double x)
    {
        double nextTerm;
        double total;
        int n;
    
        total = 0;
        nextTerm = x;
        for (n = 1; n < 20; n = n + 2)
        {
            total = total + nextTerm;  
            nextTerm = nextTerm * (-power(x, 2)) / ((n + 1) * (n + 2)); 
        } 
        return total;
    }
    

    // Program code  
    public static void main(String[] args)
    {
        // creating a scanner
        Scanner scan = new Scanner(System.in);
        
        // variables
        int rowCounter; 
        
        String bin1;
        String bin2;
        String binSum;
        int decBin1;
        int decBin2;
        int decSum;
        
        String lineOfText;
        String rLineOfText;
        String tempWord;
        String rTempWord;
        int charIndex;
        char ch; 
        
        int numTerms;
        double sinValue;
        double numerator;
        long denominator;
        double factor;
        double xTerm;
        double total;

        // print the top of the first table
        System.out.println("\t\t Table 1\n\tn\tn^2\tn^3\tn^4\n" +        
                           "\t---------------------------");
        // print the numbers on the first table
        for (rowCounter = -1; rowCounter < 11; rowCounter = rowCounter + 1)
        {
            System.out.printf("%9d", rowCounter);
            System.out.printf("%8d", (int)(power((double) rowCounter, 2)));
            System.out.printf("%8d", (int)(power((double) rowCounter, 3)));
            System.out.printf("%8d", (int)(power((double) rowCounter, 4)));
            System.out.println();
        }
        System.out.println("\n\n\n");
        
        
        
        
        // print the top of the second table
        System.out.println("\t     Table 2\n\tn\t\tn!\n" +        
                           "\t------------------");
                           
        // print the numbers on the second table
        for (rowCounter = 1; rowCounter < 15; rowCounter = rowCounter + 1)
        {
            System.out.printf("%9d", rowCounter);
            System.out.printf("%16d", factorial(rowCounter));
            System.out.println();
        }
        System.out.println("\n\n\n");
        
        
        
        
        
        // ask and get the binary strings
        System.out.print("Enter a binary number: ");
        bin1 = scan.nextLine();
        
        System.out.print("Enter another binary number: ");
        bin2 = scan.nextLine();
        
        // conversion to int
        decBin1 = toDecimal(bin1);
        decBin2 = toDecimal(bin2);
        //summation and conversion back to String
        decSum = decBin1 + decBin2;
        binSum = decToBin(decSum);
        
        // displaying the result
        System.out.printf("%s + %s = %s%n%n%n", bin1, bin2, binSum);
        

        
        
        
        
        // ask and get a line of text
        System.out.print("Enter a line of text: ");
        lineOfText = scan.nextLine();
        
        // initializing the variables
        rLineOfText = "";
        tempWord = "";
        charIndex = 0;
        
        // iteration through the line of text
        for (charIndex = 0; charIndex < lineOfText.length(); charIndex = charIndex + 1)
        {
            ch = lineOfText.charAt(charIndex);
            // detect the space and ,if space, reverse the accumulated temporary word.
            if (lineOfText.charAt(charIndex) == ' ')
            {
                rTempWord = reverse(tempWord);
                rLineOfText = rLineOfText + rTempWord + " ";
                tempWord = "";
            } 
           else
           // accumulate the temporary word to be reversed
           {
                tempWord = tempWord + ch;
           }    
        }
        // add the last reversed word
        rTempWord = reverse(tempWord);
        rLineOfText = rLineOfText + rTempWord;
        // report the result
        System.out.printf("Reverse of %s is %s%n%n%n", lineOfText, rLineOfText);
        
        
        

        
        
        //ask and get the value of x for sin(x)
        System.out.print("Enter an x to approximate sin(x): ");
        sinValue = scan.nextDouble();
                    
        // Print the top of the sine Table
        System.out.printf("%20s", "n");
        System.out.printf("%15s", "(-1)^n");
        System.out.printf("%25s", "x^(2n+1)");
        System.out.printf("%25s", "(2n+1)!");
        System.out.printf("%15s", "term");
        System.out.printf("%15s", "total"); 
        System.out.printf("%15s", "sine method"); 
        System.out.printf("%15s%n", "deviation");
        System.out.println("\t\t---------------------------------------------------------------------------------------------------------------------");
        
        total = 0;                        
        for (numTerms = 0; numTerms < 11; numTerms = numTerms + 1)
        {
            // calculations
            numerator = power(-1.0, numTerms);
            denominator = factorial(2 * numTerms + 1);
            factor = power(sinValue, 2 * numTerms + 1);
            xTerm = (numerator / denominator) * factor;
            total = total + xTerm;
            // print the results on the table
            System.out.printf("%20d", numTerms);
            System.out.printf("%15f", numerator);
            System.out.printf("%25f", factor);
            System.out.printf("%25d", denominator);
            System.out.printf("%15f", xTerm);
            System.out.printf("%15f", total);
            System.out.printf("%15f", sin(sinValue));
            System.out.printf("%15f", Math.abs(sin(sinValue) - total));
            System.out.println();
        }    
        // closing the scanner
        scan.close();
    }    
}    