import java.util.ArrayList;
import java.util.Scanner;

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
    
    public LibraryBook(LibraryBook other)
    {
           title = other.title;
           author = other.author;
           dueDate = other.dueDate;
           timesLoaned = other.timesLoaned;
    }
    
    // methods
    
    /**compares titles of two book objects
    * @author Berkay Guler
    * @version 21.12.20
    * @param other LibraryBook object 
    * @return a boolean, true if titles are the same, false otherwise
    */
    public boolean hasSameTitle(LibraryBook other)
    {
        return (title == other.title);
    }
    
    /**compares authors of two book objects
    * @author Berkay Guler
    * @version 21.12.20
    * @param other LibraryBook object 
    * @return a boolean, true if authors are the same, false otherwise
    */
    public boolean hasSameAuthor(LibraryBook other)
    {
        return (author == other.author);
    }
 
    
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
    
    public String toString()
    {
        String book;
        book = String.format("Title: %s| Author: %s| Due Date: %s| Times Loaned: %d%n",
                              title, author, dueDate, timesLoaned);
        return book;
    }   
    
    /**compares two book wrt their authors and titles
    * @author Berkay Guler
    * @version 21.12.20
    * @param other LibraryBook object 
    * @return a boolean, true if authors and titles are the same, false otherwise
    */
    public boolean equals(LibraryBook other)
    {
        // return (title == other.title && author == other.author);
        return (this.hasSameTitle(other) && this.hasSameAuthor(other));
    }
    
}

class Library
{
    // properties
    ArrayList<LibraryBook> library;

    // constructors
    public Library()
    {
        library = new ArrayList<LibraryBook>();
    }
    
    // methods
    
    /**checks if the library is empty
    * @author Berkay Guler
    * @version 14.12.20
    * @return a boolean 
    */
    public boolean isEmpty()
    {
        return library.size() == 0;
    }
    
    /**overrides the toString() method
    * @author Berkay Guler
    * @version 21.12.20
    * @return a string representation for a Library object
    */
    public String toString()
    {
        String books;
        int i;
        
        books = "";
        for (i = 0; i < library.size(); i++)
        {
            books = books + library.get(i);
        }
        
        return books;
    }
    
    
    /**adds a new LibraryBook to the library
    * @author Berkay Guler
    * @version 21.12.20
    * @param title String title of the book
    * @param author String author name
    */
    public void add(String title, String author)
    {   
        library.add(new LibraryBook(title, author, "", 0));
    }
    
    /**searchs through the library to find the book with given title.
    * @author Berkay Guler
    * @version 21.12.20
    * @param title String title of the book
    * @return LibraryBook a LibraryBook with given title, null if no such book
    */
    public LibraryBook findByTitle(String title)
    {
        int i;
        
        for(i = 0; i < library.size(); i++)
        {
            if (library.get(i).title.equals(title))
            {
                return library.get(i);
            }    
        }
        
        return null;
    }
    
    
    /**rremoves the given LibraryBook from the library
    * @author Berkay Guler
    * @version 21.12.20
    * @param other LibraryBook to be removed
    * @return True if the book is removed, else False
    */
    public boolean remove(LibraryBook other)
    {
        int i;
        
        for(i = 0; i < library.size(); i++)
        {
            if (other.equals(library.get(i)))
            {
                library.remove(i);
                return true;
            }
        }
        return false;
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
        // variables
        LibraryBook book1;
        LibraryBook book2;
        LibraryBook book3;
        LibraryBook book4;
        LibraryBook book5;
        
        // initialize the books
        book1 = new LibraryBook("War and Peace", "Leo Tolstoy", "20.12.2020", 5);
        book2 = new LibraryBook("The Odyssey", "Homer", "25.12.2020", 12);
        book3 = new LibraryBook("War and Peace", "Leo Tolstoy", "20.12.2020", 5);
        
        
        // comparison between two references to a single object
        book4 = book1;
        System.out.println("comparison between two references to a single object");
        System.out.println("Using '==' returns: " + (book1 == book4));
        System.out.println("Using '.equals()' returns: " + book1.equals(book4));
        System.out.println();
        
        // comparison between two references to two individual objects with different properties 
        System.out.println("comparison between two references to two individual " +
                           "objects with different properties");
        System.out.println("Using '==': returns: " + (book1 == book2));
        System.out.println("Using '.equals()' returns: " + book1.equals(book2));
        System.out.println();
        
        // comparison between two references to two individual objects with identical relevant properties
        System.out.println("comparison between two references to two individual " +
                           "objects with identical relevant properties");
        System.out.println("Using '==' returns: " + (book1 == book3));
        System.out.println("Using '.equals()' returns: " + book1.equals(book3));
        System.out.println();
        
        // == compares if the two reference refer to the same object, if not returns false.
        // So it returns true, false, false for parts a, b, and c, respectively.
        // .equals comes predefined, if not overwritten it behaves differently for different classes.
        // after .equals is overwritten, it behaves as we defined and now we know what it does
        
        // using the copy constructor copying the object book2
        book5 = new LibraryBook(book2);
        
        // checking the hasSameTitle and hasSameAuthor methods with the objects with same author and title
        System.out.println("checking the hasSameTitle and hasSameAuthor methods " +
                           "with the objects with same author and title");
        System.out.println(".hasSameTitle() returns: " + book2.hasSameTitle(book5));
        System.out.println(".hasSameAuthor() returns: " + book2.hasSameAuthor(book5));
        System.out.println();
        
        // checking the hasSameTitle and hasSameAuthor methods with the objects 
        // with different author and title
        System.out.println("checking the hasSameTitle and hasSameAuthor methods " +
                           "with the objects with different author and title");
        System.out.println(".hasSameTitle() returns: " + book1.hasSameTitle(book2));
        System.out.println(".hasSameTitle() returns: " + book1.hasSameAuthor(book2));
        System.out.println();
    }
}

class LibraryTest
{   
    public static void main(String[] args)
    {
        // create a scanner object;
        Scanner scan;
        scan = new Scanner(System.in);
        
        
        // variables
        Library library;
        LibraryBook book;
        int choice;
        int bookChoice;
        String title;
        String newBookTitle;
        String newBookAuthor;
        String due;
        
        // initialize the library object
        library = new Library();
        
        // add some books
        /*
        library.add("To Kill a Mockingbird", "Harper Lee");
        library.add("1984", "George Orwell");
        library.add("The Lord of the Rings", "J.R.R. Tolkien");
        library.add("The Catcher in the Rye", "J.D. Salinger");
        library.add("The Great Gatsby", "F. Scott Fitzgerald");
        library.add("The Lion, the Witch and the Wardrobe", "C.S. Lewis");
        library.add("Lord of the Flies", "William Golding");
        library.add("Animal Farm", "George Orwell");
        library.add("Catch-22", "Joseph Heller");
        library.add("The Grapes of Wrath", "John Steinbeck");
        library.add("Gone with the Wind", "Margaret Mitchell");
        library.add("Lolita", "Vladimir Nabokov");
        */
        // program
        do {
            // display main menu
            System.out.print("1- Show\n2- Find\n3- add\n4- exit\n"
                              + "Please make a choice: ");
            choice = scan.nextInt();
            scan.nextLine();
            System.out.println();
            
            // show option
            if (choice == 1)
            {
                if (library.isEmpty())
                {
                    System.out.println("Library is empty!");
                }
                else
                {
                    System.out.println(library);
                }
            }
            // find option
            else if (choice == 2)
            {
                System.out.print("Please enter the title of the book: ");
                title = scan.nextLine();
                book = library.findByTitle(title);
                if (book == null)
                {
                    System.out.println("Book not found");
                }    
                else
                {
                    // display book menu
                    System.out.print("1- Loan the book\n2- Return the book\n3- Remove\n4- Main Menu\n"
                                      + "Make a choice please:");                 
                    bookChoice = scan.nextInt();
                    scan.nextLine();
                    // loan option
                    if (bookChoice == 1)
                    {
                        if (!book.onLoan())
                        {
                            System.out.print("Enter due date in dd.mm.yyyy format: ");
                            due = scan.nextLine();
                            book.loanBook(due);
                            System.out.println("Following book has been load");
                            System.out.print(book);
                        }
                        else
                        {
                            System.out.println("Book is not available now.");
                        }    
                    }
                    
                    // return option
                    else if (bookChoice == 2)
                    {
                        if (book.dueDate != "")
                        {
                            book.returnBook();
                        }
                        else
                        {
                            System.out.println("No book found to return");
                        }
                        
                    }
                    
                    // remove option
                    else if (bookChoice == 3)
                    {
                        library.remove(book);
                    }  
                }
            }  
            // add option
            else if (choice == 3)
            {
                System.out.print("Enter the title of the new book: ");
                newBookTitle = scan.nextLine();
                System.out.print("Enter the author of the new book: ");
                newBookAuthor = scan.nextLine();
                library.add(newBookTitle, newBookAuthor);
            }
        } while (choice != 4); 
        scan.close();
    }
}


