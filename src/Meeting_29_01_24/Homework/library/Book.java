package Meeting_29_01_24.Homework.library;

public class Book {
    private String booksTitle;
    private Author author;
    private int yearOfPublicationOfTheBook;
    private boolean bookAvailabilityStatus;

    public Book() {
        this.booksTitle = "";
        this.author = new Author();
        this.yearOfPublicationOfTheBook = 0;
        this.bookAvailabilityStatus = true;
    }

    public Book(String booksTitle, Author bookAuthor, int yearOfPublicationOfTheBook) {
        this.booksTitle = booksTitle;
        this.author = bookAuthor;
        this.yearOfPublicationOfTheBook = yearOfPublicationOfTheBook;
        this.bookAvailabilityStatus = true;
    }

    public String getBooksTitle() {
        return booksTitle;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublicationOfTheBook() {
        return yearOfPublicationOfTheBook;
    }

    public void setBookAvailabilityStatus(boolean bookAvailabilityStatus) {
        this.bookAvailabilityStatus = bookAvailabilityStatus;
    }

    @Override
    public String toString() {
        return "BooksTitle: " + booksTitle + "\n" +
                "Author: " + author.getBookAuthor() + "\n" +
                "YearOfPublicationOfTheBook: " + yearOfPublicationOfTheBook + "\n" +
                "BookAvailabilityStatus: " + bookAvailabilityStatus;
    }
}
