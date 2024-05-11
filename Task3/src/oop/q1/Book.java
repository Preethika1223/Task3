package oop;

public class Book {
	private int bookID;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(int bookID, String title, String author) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
