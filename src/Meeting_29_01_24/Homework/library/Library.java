package Meeting_29_01_24.Homework.library;

import java.util.LinkedList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new LinkedList<>();
        books.add(new Book("Zbrodnia i Kara", new Author("Fiodor Dostojewski"),
                2021));
        books.add(new Book("Cudzoziemka", new Author("Bruno Schulz"),
                2011));
        books.add(new Book("Java dla zupełnie początkujących", new Author("Tonny Gaddis"),
                2019));
    }

    private void showBookCollection() {
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
    }

    private List<Book> searchBook(User user) {
        showSearchMenu();
        int choiceFromTheSearchMenu = user.chooseOptionFromTheSearchMenu();
        List<Book> foundBooks = new LinkedList<>();

        if (choiceFromTheSearchMenu == 1) {
            System.out.println("Enter the title of the book: ");
            String booksTitle = user.enterText();
            for (Book book : books) {
                if (book.getBooksTitle().contains(booksTitle)) {
                    foundBooks.add(book);
                }
            }
        }
        if (choiceFromTheSearchMenu == 2) {
            System.out.println("Enter the author of the book: ");
            String bookAuthor = user.enterText();
            for (Book book : books) {
                if (book.getAuthor().getBookAuthor().contains(bookAuthor)) {
                    foundBooks.add(book);
                }
            }
        }
        if (choiceFromTheSearchMenu == 3) {
            System.out.println("Enter the year of publication of the book: ");
            String yearOfPublicationOfTheBook = user.enterText();
            for (Book book : books) {
                if (book.getYearOfPublicationOfTheBook() == Integer.parseInt(yearOfPublicationOfTheBook)) {
                    foundBooks.add(book);
                }
            }
        }
        for (Book book : foundBooks) {
            System.out.println(book);
            System.out.println();
        }
        return foundBooks;
    }

    private Book showBook(String booksTitle) { // auxiliary method
        for (Book book : books)
            if (book.getBooksTitle().equals(booksTitle)) {
                return book;
            }
        return null;
    }

    private void borrowABook(User user) {
        System.out.println("Enter the title of the book you want to borrow: ");
        String booksTitle = user.enterText();
        books.get(books.indexOf(showBook(booksTitle))).setBookAvailabilityStatus(false);
    }

    private void returnTheBook(User user) {
        System.out.println("Enter the title of the book you want to return: ");
        String booksTitle = user.enterText();
        books.get(books.indexOf(showBook(booksTitle))).setBookAvailabilityStatus(true);
    }

    private void addABook(User user) {
        System.out.println("Enter the title of the book you want to add to the library system: ");
        String booksTitle = user.enterText();
        System.out.println("Enter the author of this book: ");
        String bookAuthor = user.enterText();
        System.out.println("Enter the year of publication of this book: ");
        int yearOfPublicationOfTheBook = Integer.parseInt(user.enterText());
        books.add(new Book(booksTitle, new Author(bookAuthor),
                yearOfPublicationOfTheBook));
    }

    private void removeBook(User user) {
        System.out.println("Enter the title of the book you want to remove from the library system: ");
        String booksTitle = user.enterText();
        books.remove(showBook(booksTitle));
    }

    private void showMainMenu() {
        System.out.println();
        System.out.println("Welcome to the library!\n" +
                           "You can choose from the following options:\n" +
                           "Show book collection - enter 1:\n" +
                           "Search for book - enter 2:\n" +
                           "Borrow a book - enter 3:\n" +
                           "Return the book - enter 4:\n" +
                           "Add a book - enter 5:\n" +
                           "Remove book - enter 6:\n" +
                           "Exiting the program - enter 0:");
    }

    private void showSearchMenu() {
        System.out.println();
        System.out.println("Welcome to search!\n" +
                           "You can choose from the following options:\n" +
                           "Search by book title - enter 1:\n" +
                           "Search by book author - enter 2:\n" +
                           "Search by the book's year of publication - enter 3:");
    }

    public void startOfTheEntireLibrarySystem(User user) {
        int choiceFromTheMainMenu;

        do {
            showMainMenu();
            choiceFromTheMainMenu = user.chooseOptionFromTheMainMenu();

            if (choiceFromTheMainMenu == 1) {
                showBookCollection();
            } else if (choiceFromTheMainMenu == 2) {
                searchBook(user);
            } else if (choiceFromTheMainMenu == 3) {
                borrowABook(user);
            } else if (choiceFromTheMainMenu == 4) {
                returnTheBook(user);
            } else if (choiceFromTheMainMenu == 5) {
                addABook(user);
            } else if (choiceFromTheMainMenu == 6) {
                removeBook(user);
            } else if (choiceFromTheMainMenu == 0) {
                System.out.println("Thank you!");
            } else {
            }
        }
        while (choiceFromTheMainMenu != 0);
    }
}
