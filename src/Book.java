import com.sun.jdi.connect.Connector;

public class Book {
    static int totalBooks;

    String title ;

    String author ;

    String isbn ;

    boolean inBorrowed;

    static {
        totalBooks = 0 ;
    }
    { // Object Init
        totalBooks++;
    }
    Book(String isbn, String title, String author){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }
    Book(String isbn){
        this(isbn, "Unknown" , "Unknown");
    }
    static int getTotalBooks (){
          return totalBooks ;
    }
    void borrowBook(){
        if (inBorrowed){
            System.out.println("Book is already borrowed");
        }
        else {
            this.inBorrowed = true;
            System.out.println("Enjoy the Book");
        }
    }
    void  returnBook(){
        if (inBorrowed){
            this.inBorrowed = false;
            System.out.println("Hope you enjoyed, Please leave a review");
        }else {
            System.out.println("This Book already in library");

        }
    }
    public static void main(String[] args) {
       Book myLibrary  = new Book("1", "Java Book" , "Oracle") ;
        System.out.println(Book.getTotalBooks());
        myLibrary.borrowBook();
        myLibrary.borrowBook();
        myLibrary.returnBook();
        myLibrary.returnBook();
    }
}
