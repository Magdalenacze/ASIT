package Meeting_29_01_24.Homework.library;

import java.io.Serializable;

public class Book implements Serializable {

    private String booksTitle;
    private String bookAuthor;
    private Integer yearOfPublicationOfTheBook;
    private boolean bookAvailabilityStatus;

    public Book(String booksTitle, String bookAuthor,
                Integer yearOfPublicationOfTheBook, boolean bookAvailabilityStatus) {
        this.booksTitle = booksTitle;
        this.bookAuthor = bookAuthor;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.bookAvailabilityStatus = bookAvailabilityStatus;
    }

    public String getBooksTitle() {
        return booksTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getYearOfPublicationOfTheBook() {
        return yearOfPublicationOfTheBook;
    }

    public boolean isBookAvailabilityStatus() {
        return bookAvailabilityStatus;
    }

    public void setBookAvailabilityStatus(boolean bookAvailabilityStatus) {
        this.bookAvailabilityStatus = bookAvailabilityStatus;
    }

    @Override
    public String toString() {
        return "BooksTitle: " + booksTitle + "\n" +
                "Author: " + bookAuthor + "\n" +
                "YearOfPublicationOfTheBook: " + yearOfPublicationOfTheBook + "\n" +
                "BookAvailabilityStatus: " + bookAvailabilityStatus;
    }
}