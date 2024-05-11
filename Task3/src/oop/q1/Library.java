package oop;

public class Library {
	private Book[] books;
    private int capacity;
    private int size;

    public Library(int capacity) {
        this.capacity = capacity;
        books = new Book[capacity];
        size = 0;
    }

    public void addBook(Book book) {
        if (size < capacity) {
            books[size++] = book;
            System.out.println("Book added successfully.");
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void removeBook(int bookID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                books[i] = null;
                size--;
                System.out.println("Book removed successfully.");
                return;
            }
        }
        System.out.println("Book not found with ID: " + bookID);
    }

    public void searchBook(int bookID) {
        for (int i = 0; i < size; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Book found:");
                System.out.println("Title: " + books[i].getTitle());
                System.out.println("Author: " + books[i].getAuthor());
                System.out.println("Availability: " + (books[i].isAvailable() ? "Available" : "Not Available"));
                return;
            }
        }
        System.out.println("Book not found with ID: " + bookID);
    }

    public void displayBooks() {
    	if (books == null) {
            System.out.println("No books in the library.");
            return;
    	}
        System.out.println("Books in the library:");
        for (int i = 0; i < size; i++) {
            System.out.println("Book ID: " + books[i].getBookID());
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Availability: " + (books[i].isAvailable() ? "Available" : "Not Available"));
            System.out.println();
        }
    }
}
