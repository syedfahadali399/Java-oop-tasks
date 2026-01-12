package labsession4;

class Book {

    public String title;
    public String author;
    public String ISBN;
    public int publishedYear;
    public int copiesAvaliable;

    Book(String title, String author) {
        this.title = title;
        this.author = author;

        displayBookInfo();
    }

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.ISBN = isbn;

        displayBookInfo();
    }

    Book(String title, String author, String isbn, int publishedYear, int copies) {
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
        this.publishedYear = publishedYear;
        this.copiesAvaliable = copies;

        displayBookInfo();
    }

    void displayBookInfo() {
        System.out.println("\nBook Management System");
        System.out.println("Title: " + (title != null? title: "Not avaliable"));
        System.out.println("Author: " + (author != null? author: "Not avaliable"));
        System.out.println("Book ISBN: " + (ISBN != null? ISBN: "Not avaliable"));
        System.out.println("Published Year: " + (publishedYear == 0 ? "Not available" : publishedYear));
        System.out.println("Book Copies: " + copiesAvaliable);
    }

    void updateCopies(int num) {
        this.copiesAvaliable = num;
    }
}

public class task2 {
    public static void main(String[] args) {

        Book book1 = new Book("Atomic Habits", "James Clear");
        book1.displayBookInfo();
        
        Book book2 = new Book("Atomic Habits", "James Clear", "234765198");
        book2.displayBookInfo();
        
        Book book3 = new Book("Atomic Habits", "James Clear", "234765194", 2002, 500);
        book3.updateCopies(700);
        book3.displayBookInfo();

    }
}
