class Library {
    private String[] availableBooks;
    private String[] issuedBooks;
    private int availableBooksCount;
    private int issuedBooksCount;
    private static final int MAX_BOOKS = 100; // Maximum number of books the library can handle

    // Constructor
    public Library() {
        availableBooks = new String[MAX_BOOKS];
        issuedBooks = new String[MAX_BOOKS];
        availableBooksCount = 0;
        issuedBooksCount = 0;
    }

    // Method to add a book to the library
    public void addBook(String bookTitle) {
        if (availableBooksCount < MAX_BOOKS) {
            availableBooks[availableBooksCount] = bookTitle;
            availableBooksCount++;
            System.out.println(bookTitle + " has been added to the library.");
        } else {
            System.out.println("Library is at full capacity. Cannot add more books.");
        }
    }

    // Method to issue a book from the library
    public void issueBook(String bookTitle) {
        if (containsBook(availableBooks, availableBooksCount, bookTitle)) {
            removeFromArray(availableBooks, availableBooksCount, bookTitle);
            issuedBooks[issuedBooksCount] = bookTitle;
            issuedBooksCount++;
            System.out.println(bookTitle + " has been issued.");
        } else {
            System.out.println(bookTitle + " is not available in the library.");
        }
    }

    // Method to return a book to the library
    public void returnBook(String bookTitle) {
        if (containsBook(issuedBooks, issuedBooksCount, bookTitle)) {
            removeFromArray(issuedBooks, issuedBooksCount, bookTitle);
            availableBooks[availableBooksCount] = bookTitle;
            availableBooksCount++;
            System.out.println(bookTitle + " has been returned.");
        } else {
            System.out.println(bookTitle + " was not issued from this library.");
        }
    }

    // Method to display available books in the library
    public void showAvailableBooks() {
        if (availableBooksCount == 0) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Available books in the library:");
            for (int i = 0; i < availableBooksCount; i++) {
                System.out.println(availableBooks[i]);
            }
        }
    }

    // Method to display issued books from the library
    public void showIssuedBooks() {
        if (issuedBooksCount == 0) {
            System.out.println("No books have been issued from the library.");
        } else {
            System.out.println("Issued books from the library:");
            for (int i = 0; i < issuedBooksCount; i++) {
                System.out.println(issuedBooks[i]);
            }
        }
    }

    // Helper method to check if a book is in the array
    private boolean containsBook(String[] booksArray, int count, String bookTitle) {
        for (int i = 0; i < count; i++) {
            if (booksArray[i].equals(bookTitle)) {
                return true;
            }
        }
        return false;
    }

// Helper method to remove a book from the array
private void removeFromArray(String[] booksArray, int count, String bookTitle) {
    for (int i = 0; i < count; i++) {
        if (booksArray[i].equals(bookTitle)) {
            // Shift remaining elements to the left
            for (int j = i; j < count - 1; j++) {
                booksArray[j] = booksArray[j + 1];
            }
            // Decrease the count of books
            count--;
            return;
        }
    }
}
}

public class Task {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook("Book1");
        library.addBook("Book2");
        library.addBook("Book3");

        library.showAvailableBooks();

        library.issueBook("Book1");
        library.issueBook("Book4"); // This book is not available

        library.showAvailableBooks();
        library.showIssuedBooks();

        library.returnBook("Book1");
        library.returnBook("Book4"); // This book was not issued

        library.showAvailableBooks();
        library.showIssuedBooks();
    }
}

