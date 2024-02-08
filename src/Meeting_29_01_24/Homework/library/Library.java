package Meeting_29_01_24.Homework.library;

import java.util.LinkedList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library(List<Book> booksFromFile) {
        books = new LinkedList<>();
        books.addAll(booksFromFile);
//        books.add(new Book("Zbrodnia i Kara",
//                           "Fiodor Dostojewski",
//                           2021,
//                           true));
//        books.add(new Book("Cudzoziemka",
//                           "Bruno Schulz",
//                           2011,
//                           true));
//        books.add(new Book("Java dla zupełnie początkujących",
//                           "Tonny Gaddis",
//                           2019,
//                           true)); // for testing purposes
    }

    public List<Book> getBooks(){
        return books;
    }

    public List<Book> searchByBookTitle(String booksTitle) {
        List<Book> foundBooks = new LinkedList<>();
        for (Book book : books) {
            if (book.getBooksTitle().toLowerCase().contains(booksTitle.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        if (foundBooks.isEmpty()) {
            throw new RuntimeException("The book with the given title was not found!");
        }
        return foundBooks;
    }

    public List<Book> searchByBookAuthor(String bookAuthor) {
        List<Book> foundBooks = new LinkedList<>();
        for (Book book : books) {
            if (book.getBookAuthor().toLowerCase().contains(bookAuthor.toLowerCase())) {
                foundBooks.add(book);
            }
        }
        if (foundBooks.isEmpty()) {
            throw new RuntimeException("The book with the given author was not found!");
        }
        return foundBooks;
    }

    public List<Book> searchByYearOfPublication(String yearOfPublicationOfTheBook) {
        List<Book> foundBooks = new LinkedList<>();
        for (Book book : books) {
            if (book.getYearOfPublicationOfTheBook() == Integer.parseInt(yearOfPublicationOfTheBook)) {
                foundBooks.add(book);
            }
        }
        if (foundBooks.isEmpty()) {
            throw new RuntimeException("The book with the given year of publication was not found!");
        }
        return foundBooks;
    }

    public Book showBook(String booksTitle) { // auxiliary method
        for (Book book : books)
            if (book.getBooksTitle().equals(booksTitle)) {
                return book;
            }
        return null;
    }

    public void borrowABook(String booksTitle) {
        if (!books.get(books.indexOf(showBook(booksTitle))).isBookAvailabilityStatus()) {
            throw new RuntimeException("Sorry, it is currently not possible to borrow a book with this title!");
        }
        books.get(books.indexOf(showBook(booksTitle))).setBookAvailabilityStatus(false);
    }

    public void returnTheBook(String booksTitle) {
        if (books.get(books.indexOf(showBook(booksTitle))).isBookAvailabilityStatus()) {
            throw new RuntimeException("Sorry, it is not possible to return a book with the given title!");
        }
        books.get(books.indexOf(showBook(booksTitle))).setBookAvailabilityStatus(true);
    }

    public void addABook(String booksTitle, String bookAuthor, Integer yearOfPublicationOfTheBook) {
        if (booksTitle.isEmpty() || bookAuthor.isEmpty() || yearOfPublicationOfTheBook < 1950) {
            throw new RuntimeException("Sorry, it is not possible to add a book, the entered data is incorrect or incomplete!");
        }
        books.add(new Book(booksTitle, bookAuthor, yearOfPublicationOfTheBook, true));
    }

    public void removeBook(String booksTitle) {
        Book book = showBook(booksTitle);
        if (book == null) {
            throw new RuntimeException("Sorry, it is not possible to remove a book with the given title!");
        }
        books.remove(book);
    }
}
