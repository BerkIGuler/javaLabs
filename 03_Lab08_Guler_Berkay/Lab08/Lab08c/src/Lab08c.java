import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/** This program reads a text file, processes it and outputs some statatistics. 
*@author Berkay Guler
*@version 23.12.2020
*/
public class Lab08c
{
    public static void main(String [] args) throws FileNotFoundException
    {
        // declare File and Scanner objects;
        File text;
        Scanner scan;
        
        // initialize File and Scanner objects
        text = new File("test.txt");
        scan = new Scanner(text);
        
        // variables
        ArrayList<Integer> freqs;
        String word;
        String newWord;
        int length;
        int counter;
        int maxLength;
        int index; 
        char ch;
        int i;
        int highFreq;
        int highFreqLength;
        
        // create and ArrayList object
        freqs = new ArrayList<Integer>();
        
        
        // add the length of each word in the .txt file as an element to freqs ArrayList 
        while (scan.hasNextLine())
        {
            word = scan.next();
            newWord = "";
            for (i = 0; i < word.length(); i++)
            {
                ch = word.charAt(i);
                if (ch != '.' && ch != ',' && ch != ';')
                {
                    newWord = newWord + ch;    
                }
            }
            freqs.add(newWord.length());
        }
        
        // find the maximum length of the words in .txt file 
        maxLength = 0;
        for (i = 0; i < freqs.size(); i++)
        {
            if (freqs.get(i) > maxLength)
            {
                maxLength = freqs.get(i);    
            }
        }
        
        // initialize the variables
        length = 1;
        highFreq = 0;
        highFreqLength = 0;
        // iterate through the ArrayList to find frequencies of each entry.
        for (index = 1; index <= maxLength; index++)
        {
            counter = 0;
            for (i = 0; i < freqs.size(); i++)
            {
                if (freqs.get(i) == length)
                {
                    counter = counter + 1;
                }
            }
            if (counter > highFreq)
            {
                highFreq = counter;
                highFreqLength = length;
            }
            System.out.printf("%d words of length %d%n", counter, length);
            length = length + 1;
        }
        
        // display the results
        System.out.printf("The longest word has length %d.%n", maxLength);
        System.out.printf("The most frequently occurring word length is %d, "
                         + "which occurs %d times.", highFreqLength, highFreq);
                                        
        scan.close();
    }
}


