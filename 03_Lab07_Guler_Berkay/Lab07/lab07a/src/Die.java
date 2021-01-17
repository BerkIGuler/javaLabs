import java.lang.Math;

/** This program is a die thrower.
* @author Berkay Guler
* @version 13.12.20 
*/
class Test
{
    public static void main(String[] args)
    {
        // variables
        int Die1;
        int Die2;
        int throwNum;
        
        // initialize counters and start the program
        throwNum = 0;
        do {
            Die1 = (int) (Math.random() * 6 + 1);  
            Die2 = (int) (Math.random() * 6 + 1);
            throwNum = throwNum + 1;      
        } while (!(Die1 == 6 && Die2 == 6));
        
        // report the number of throws before double six
        System.out.println("Number of throws until double 6 is " + throwNum);
    }    
}


/** This class provides the blueprint of a die object
* @author Berkay Guler
* @version 1.0
*/
public class Die
{
    // properties
    int faceValue;
    
    // constructors
    public Die()
    {
        faceValue = (int) (Math.random() * 6 + 1); ;    
    }
    
    // methods
    
    /** rolls the die and returns
    * @author Berkay Guler
    * @version 1.0 
    * @return a new face value
    */
    public int roll()
    {
        faceValue = (int) (Math.random() * 6 + 1);
        return faceValue;
    }   
    
    /** rolls the die and returns the new face value
    * @author Berkay Guler
    * @version 1.0 
    * @return an int new face value
    */
    public int getFaceValue()
    {
        return faceValue;
    }
    
    /** overwrites toString()
    * @author Berkay Guler
    * @version 1.0 
    * @return string representation of the object
    */
    @Override
    public String toString() 
    {
        return "die = " + faceValue;
    }
}


/** a program that tests Die class
* @author Berkay Guler
* @version 1.0 
*/
class TestDie
{
    public static void main(String[] args)
    {   
        // variables
        Die die1;
        Die die2;
        
        // creating Die objects
        die1 = new Die();
        die2 = new Die();
        
        // printing initial values of dice
        System.out.println("die1 = "+ die1.getFaceValue());
        System.out.println("die2 = "+ die2.getFaceValue());
        
        die1.roll();
        die2.roll();
        
        // printing new values of dice after roll
        System.out.println("die1 = "+ die1.getFaceValue());
        System.out.println("die2 = "+ die2.getFaceValue());
        
        // printing the object with overwritten toString method
        System.out.println(die1);
        System.out.println(die2);
    
    }
}    


/** a class that takes two Die objects
* @author Berkay Guler
* @version 1.0 
*/
class Dice
{
    // properties
    Die die1;
    Die die2;
    
    // constructors
    public Dice(Die theDie1, Die theDie2)
    {
        die1 = theDie1;
        die2 = theDie2;
    } 
    
    // methods
    
    /** rolls Dice 
    * @author Berkay Guler
    * @version 1.0 
    * @return int new sum of face values
    */
    public int roll()
    {
        return die1.roll() + die2.roll();
    }    
    
    
    /** return face value of dice1
    * @author Berkay Guler
    * @version 1.0 
    * @return int face value of die1
    */
    public int getDie1FaceValue()
    {
        return die1.getFaceValue();
    }
    
    
    /** return face value of die2
    * @author Berkay Guler
    * @version 1.0 
    * @return int face value of die2
    */
    public int getDie2FaceValue()
    {
        return die2.getFaceValue();
    }
    
    public int getDiceTotal()
    {
        return this.getDie2FaceValue() + this.getDie2FaceValue();
    }
    
    
    /** overwrites toString() method
    * @author Berkay Guler
    * @version 1.0 
    * @return string representation of the object
    */
    @Override
    public String toString()
    {
        return "Die1 = " + this.getDie1FaceValue() + ", Die2 = " + this.getDie2FaceValue();
    }
    
}



/** a class that takes a Dice object and plays with it
* @author Berkay Guler
* @version 1.0 
*/
class DiceGame
{
    // properties
    Dice dice;
    
    // constructor
    public DiceGame(Dice theDice)
    {
        dice = theDice;
    }
    
    // methods
    /** returns number of throws until a double 6
    * @author Berkay Guler
    * @version 1.0 
    * @return int number of throws until a double 6
    */
    public int play()
    {
        int throwNum;
        
        throwNum = 0;
        do {
            dice.roll();
            throwNum = throwNum + 1;      
        } while (!(dice.getDie1FaceValue() == 6 && dice.getDie2FaceValue() == 6));   
        
        return throwNum; 
    }
}


/** a program that test the DiceGame class
* @author Berkay Guler
* @version 1.0 
*/
class TestDiceGame
{
    public static void main(String[] args)
    {
        // variables
        Die die1;
        Die die2;
        Dice dice;
        DiceGame diceG;
        
        // initialize the objects
        die1 = new Die();
        die2 = new Die();
        dice = new Dice(die1, die2);
        diceG = new DiceGame(dice);
        
        // start the game and report the result
        System.out.println("Number of throws until double 6 is " + diceG.play());
    }
}