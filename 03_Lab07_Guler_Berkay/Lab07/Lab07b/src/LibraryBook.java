/**This class provides the blueprint for a book object
 * @author Berkay Guler
 * @version 14.12.20
 */
 public class LibraryBook
{
    // properties
    String title;
    String author;
    String dueDate;
    int timesLoaned;
    
    // constructors
    public LibraryBook(String theTitle, String theAuthor, String theDue, int theTimesLoaned)
    {
         title = theTitle;
         author = theAuthor;
         dueDate = theDue;
         timesLoaned = theTimesLoaned;
    }
    
    // methods
    
    /**Loans the book if not already loaned
    * @author Berkay Guler
    * @version 14.12.20
    * @param newDue String for the new due date 
    */
    public void loanBook(String newDue)
    {
        if (!onLoan())
        {
            dueDate = newDue;
            timesLoaned = timesLoaned + 1;    
        }
    }
    
    
    /**returns the book 
    * @author Berkay Guler
    * @version 14.12.20
    */
    public void returnBook()
    {
        dueDate = "";   
    }

    /**returns the times load
    * @author Berkay Guler
    * @version 14.12.20
    * @return an int representing the times loaned
    */
    public int getTimesLoaned()
    {
        return timesLoaned;   
    }
    
    /**returns if the book is loaned
    * @author Berkay Guler
    * @version 14.12.20
    * @return a boolean, true if a book is loaned, else false
    */
    public boolean onLoan()
    {
        if (dueDate.length() != 0)
        {
            return true;
        }
        return false;
    }

    /**overrides the toString() method
    * @author Berkay Guler
    * @version 14.12.20
    * @return a string representation for a LibraryBook object
    */
    @Override
    public String toString()
    {
        String book;
        book = String.format("Title: %s%nAuthor: %s%nDue Date: %s%nTimes Loaned: %d%n",
                              title, author, dueDate, timesLoaned);
        return book;
    }                         
    
}


/**This program experiments with LibraryBook class
 * @author Berkay Guler
 * @version 14.12.20
 */
class TestLibraryBook
{
    public static void main(String[] args)
    {
        // varibles
        LibraryBook book1;
        LibraryBook book2;
        LibraryBook book3;
        
        // initialize the books
        book1 = new LibraryBook("War and Peace", "Leo Tolstoy", "20.12.2020", 5);
        book2 = new LibraryBook("The Odyssey", "Homer", "25.12.2020", 12);
        book3 = new LibraryBook("Crime and Punishment", "Fyodor Dostoyevsky", "16.12.2020", 7);
        
        
        // display the books
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        
        // return the books 
        book1.returnBook();
        book2.returnBook();
        book3.returnBook();
        
        // display the books 
        System.out.println("returning the books...\n");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        
        // loan the books if available
        book1.loanBook("27.12.2020");
        book2.loanBook("28.12.2020");
        book3.loanBook("19.12.2020");
        
        // display the books 
        System.out.println("loaning the books...\n");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        
        
        // Loan and already loaned book
        System.out.println("Trying to loan War and Peace...\n");
        
        if (!book1.onLoan())
        {
            book1.loanBook("31.12.2020");
        }
        else
        {
            System.out.println( book1.title + " is not available now, will be available on " + book1.dueDate);
        }    
        
        System.out.println("Returning War and Peace...\n");
        book1.returnBook();
        
        book1.loanBook("31.12.2020");
        book2.loanBook("31.12.2020");
        
        // display the books 
        System.out.println("Loaning War and Peace...\n");
        System.out.println(book1);
        System.out.println(book2);
        
    }
}