import java.util.*;

class Book {
    private String name;
    private String author;
    private String issuedTo;
    private Date issuedOn;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
        this.issuedTo = null;
        this.issuedOn = null;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getIssuedTo() {
        return issuedTo;
    }

    public Date getIssuedOn() {
        return issuedOn;
    }

    public void issueBook(String studentName) {
        this.issuedTo = studentName;
        this.issuedOn = new Date();
    }

    public void returnBook() {
        this.issuedTo = null;
        this.issuedOn = null;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", issuedTo='" + issuedTo + '\'' +
                ", issuedOn=" + issuedOn +
                '}';
    }
}

class Library {
    private Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(String name, String author) {
        books.put(name, new Book(name, author));
    }

    public void issueBook(String bookName, String studentName) {
        Book book = books.get(bookName);
        if (book != null && book.getIssuedTo() == null) {
            book.issueBook(studentName);
            System.out.println("Book '" + bookName + "' issued to " + studentName);
        } else {
            System.out.println("Book '" + bookName + "' is not available for issue");
        }
    }

    public void returnBook(String bookName) {
        Book book = books.get(bookName);
        if (book != null && book.getIssuedTo() != null) {
            book.returnBook();
            System.out.println("Book '" + bookName + "' returned successfully");
        } else {
            System.out.println("Book '" + bookName + "' is not issued");
        }
    }

    public void displayBooks() {
        System.out.println("Books available in the library:");
        for (Book book : books.values()) {
            System.out.println(book);
        }
    }
}

public class Task {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook("Java Programming", "John Doe");
        library.addBook("Python Basics", "Jane Smith");
        library.addBook("Data Structures and Algorithms", "Alice Johnson");

        // Display available books
        library.displayBooks();

        // Issuing a book
        library.issueBook("Java Programming", "Alice");
        library.displayBooks();

        // Returning the book
        library.returnBook("Java Programming");
        library.displayBooks();
    }
}
