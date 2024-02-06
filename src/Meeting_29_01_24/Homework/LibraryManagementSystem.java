package Meeting_29_01_24.Homework;

import Meeting_29_01_24.Homework.library.Book;
import Meeting_29_01_24.Homework.library.Library;
import Meeting_29_01_24.Homework.library.LibraryRepository;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.List;

public class LibraryManagementSystem {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        LibraryRepository libraryRepository = new LibraryRepository();
        Library library = new Library(libraryRepository.readingFromfile());

        int choiceFromTheMainMenu = -1;
        int choiceFromTheSearchMenu = -1;

        do {
            System.out.println("Welcome to the library!\n" +
                    "You can choose from the following options:\n" +
                    "Show book collection - enter 1:\n" +
                    "Search for book - enter 2:\n" +
                    "Borrow a book - enter 3:\n" +
                    "Return the book - enter 4:\n" +
                    "Add a book - enter 5:\n" +
                    "Remove book - enter 6:\n" +
                    "Exiting the program - enter 0:");
                try {
                choiceFromTheMainMenu = scanner.nextInt();
                } catch (InputMismatchException ex) {
                scanner.nextLine();
                }
                switch (choiceFromTheMainMenu) {
                    case 1:
                        System.out.println("A collection of all books available in the library:");
                        List<Book> books = library.getBooks();
                        for (Book book : books) {
                            System.out.println(book);
                            System.out.println();
                        }
                        break;
                    case 2:
                        do {
                            System.out.println("Welcome to search!\n" +
                                    "You can choose from the following options:\n" +
                                    "Search by book title - enter 1:\n" +
                                    "Search by book author - enter 2:\n" +
                                    "Search by the book's year of publication - enter 3:");
                            try {
                                choiceFromTheSearchMenu = scanner.nextInt();
                            } catch (InputMismatchException ex) {
                                scanner.nextLine();
                            }
                            switch (choiceFromTheSearchMenu) {
                                case 1:
                                    System.out.println("Enter the title of the book:");
                                    List<Book> searchResultByBookTitle = library.searchByBookTitle(enterText(scanner));
                                    System.out.println("Search result:");
                                    for (Book book : searchResultByBookTitle) {
                                        System.out.println(book);
                                        System.out.println();
                                    }
                                    break;
                                case 2:
                                    System.out.println("Enter the author of the book:");
                                    List<Book> searchResultByBookAuthor = library.searchByBookAuthor(enterText(scanner));
                                    System.out.println("Search result:");
                                    for (Book book : searchResultByBookAuthor) {
                                        System.out.println(book);
                                        System.out.println();
                                    }
                                    break;
                                case 3:
                                    System.out.println("Enter the year of publication of the book:");
                                    List <Book> searchResultByYearOfPublication = library.searchByYearOfPublication(enterText(scanner));
                                    System.out.println("Search result:");
                                    for (Book book : searchResultByYearOfPublication) {
                                        System.out.println(book);
                                        System.out.println();
                                    }
                                    break;
                            }
                        } while (choiceFromTheSearchMenu != 1 && choiceFromTheSearchMenu != 2 &&
                                choiceFromTheSearchMenu != 3);
                    case 3:
                        System.out.println("Enter the title of the book you want to borrow:");
                        library.borrowABook(enterText(scanner));
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Enter the title of the book you want to return:");
                        library.returnTheBook(enterText(scanner));
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Enter the title of the book you want to add to the library system:");
                        String booksTitle = enterText(scanner);
                        System.out.println("Enter the author of this book:");
                        String bookAuthor = enterText(scanner);
                        System.out.println("Enter the year of publication of this book:");
                        int yearOfPublicationOfTheBook = Integer.parseInt(enterText(scanner));
                        library.addABook(booksTitle, bookAuthor, yearOfPublicationOfTheBook);
                        System.out.println();
                        break;
                    case 6:
                        System.out.println("Enter the title of the book you want to remove from the library system: ");
                        library.removeBook(enterText(scanner));
                        System.out.println();
                        break;
                    case 0:
                        libraryRepository.writingToAFile(library.getBooks());
                        System.out.println("Thank you!");
                        break;
                    default:
                        System.out.println("Incorrect value entered!");
                        System.out.println();
                }
        } while (choiceFromTheMainMenu != 0);
        scanner.close();
    }

    public static String enterText(Scanner scanner) { // auxiliary method
        String textInput;

        do {
            textInput = scanner.nextLine();
        } while (textInput.isEmpty());
        return textInput;
    }
}