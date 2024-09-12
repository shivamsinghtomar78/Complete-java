package Challenge;

public class Book {
    static int totalBooks;
    String title;
    String author;
    String  isbn;
    boolean isBorrowed;

    static {
        totalBooks=0;
    }
    {
        totalBooks++;
    }
    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
    }
    Book(String isbn){
        this(isbn,"Unknown","Unknown");
    }
    static int getTotalBooks(){
        return totalBooks;
    }
    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else{
            this.isBorrowed=true;
            System.out.println("Enjoy "+this.title);
        }

    }
    void returnBook(){
        if(isBorrowed){
            this.isBorrowed=false;
            System.out.println("Hope you enjoyed ,please leave a review");
        }
        else{
            System.out.println("This Book is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designOfThings=new Book("1","Deisgn","Author");
        Book myBook=new Book("2");
        System.out.println(Book.getTotalBooks());
        designOfThings.borrowBook();
        myBook.borrowBook();
        designOfThings.borrowBook();
        designOfThings.returnBook();
        designOfThings.returnBook();
    }
}

