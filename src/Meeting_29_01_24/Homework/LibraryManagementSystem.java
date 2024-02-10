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
        Library library = new Library(libraryRepository.readingFromFile());

        int choiceFromTheMainMenu = -1;
        int choiceFromTheSearchMenu = -1;

        do {
            showLibraryMainMenu();
                try {
                choiceFromTheMainMenu = scanner.nextInt();
                scanner.nextLine();
                } catch (InputMismatchException ex) {
                scanner.nextLine();
                }
                switch (choiceFromTheMainMenu) {
                    case 1:
                        wantToSeeBookCollections(library);
                        break;
                    case 2:
                        do {
                            showBookSearchMenu();
                            try {
                                choiceFromTheSearchMenu = scanner.nextInt();
                                scanner.nextLine();
                            } catch (InputMismatchException ex) {
                                scanner.nextLine();
                            }
                            switch (choiceFromTheSearchMenu) {
                                case 1:
                                    wantToSearchForABookByTitle(library, scanner);
                                    break;
                                case 2:
                                    wantToSearchForABookByAuthor(library, scanner);
                                    break;
                                case 3:
                                    wantToSearchForABookByYearOfPublication(library, scanner);
                                    break;
                            }
                        } while (choiceFromTheSearchMenu != 1 && choiceFromTheSearchMenu != 2 &&
                                choiceFromTheSearchMenu != 3);
                        break;
                    case 3:
                        wantToBorrowABook(library, scanner);
                        break;
                    case 4:
                        wantToReturnABook(library, scanner);
                        break;
                    case 5:
                        wantToAddABook(library, scanner);
                        break;
                    case 6:
                        wantToRemoveABook(library, scanner);
                        break;
                    case 0:
                        exitingTheApplicationAndSavingToAFile(library, libraryRepository);
                        break;
                    default:
                        System.out.println("Incorrect value entered!");
                        System.out.println();
                }
        } while (choiceFromTheMainMenu != 0);
        scanner.close();
    }

    private static String enterText(Scanner scanner) { // auxiliary method
        String textInput;

        do {
            textInput = scanner.nextLine();
        } while (textInput.isEmpty());
        return textInput;
    }

    private static void showLibraryMainMenu() {
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

    private static void wantToSeeBookCollections(Library library) {
        System.out.println("A collection of all books available in the library:");
        List<Book> books = library.getBooks();
        for (Book book : books) {
            System.out.println(book);
            System.out.println();
        }
    }

    private static void showBookSearchMenu() {
        System.out.println("Welcome to search!\n" +
                "You can choose from the following options:\n" +
                "Search by book title - enter 1:\n" +
                "Search by book author - enter 2:\n" +
                "Search by the book's year of publication - enter 3:");
    }

    private static void wantToSearchForABookByTitle(Library library, Scanner scanner) {
        System.out.println("Enter the title of the book:");
        List<Book> searchResultByBookTitle = library.searchByBookTitle(enterText(scanner));
        System.out.println("Search result:");
        for (Book book : searchResultByBookTitle) {
            System.out.println(book);
            System.out.println();
        }
    }

    private static void wantToSearchForABookByAuthor(Library library, Scanner scanner) {
        System.out.println("Enter the author of the book:");
        List<Book> searchResultByBookAuthor = library.searchByBookAuthor(enterText(scanner));
        System.out.println("Search result:");
        for (Book book : searchResultByBookAuthor) {
            System.out.println(book);
            System.out.println();
        }
    }

    private static void wantToSearchForABookByYearOfPublication(Library library, Scanner scanner) {
        System.out.println("Enter the year of publication of the book:");
        List <Book> searchResultByYearOfPublication = library.searchByYearOfPublication(enterText(scanner));
        System.out.println("Search result:");
        for (Book book : searchResultByYearOfPublication) {
            System.out.println(book);
            System.out.println();
        }
    }

    private static void wantToBorrowABook(Library library, Scanner scanner) {
        System.out.println("Enter the title of the book you want to borrow:");
        library.borrowABook(enterText(scanner));
        System.out.println("The book has been successfully borrowed!");
        System.out.println();
    }

    private static void wantToReturnABook(Library library, Scanner scanner) {
        System.out.println("Enter the title of the book you want to return:");
        library.returnTheBook(enterText(scanner));
        System.out.println("The book has been successfully returned!");
        System.out.println();
    }

    private static void wantToAddABook(Library library, Scanner scanner) {
        System.out.println("Enter the title of the book you want to add to the library system:");
        String booksTitle = enterText(scanner);
        System.out.println("Enter the author of this book:");
        String bookAuthor = enterText(scanner);
        System.out.println("Enter the year of publication of this book:");
        int yearOfPublicationOfTheBook = Integer.parseInt(enterText(scanner));
        library.addABook(booksTitle, bookAuthor, yearOfPublicationOfTheBook);
        System.out.println("The book has been successfully added!");
        System.out.println();
    }

    private static void wantToRemoveABook(Library library, Scanner scanner) {
        System.out.println("Enter the title of the book you want to remove from the library system: ");
        library.removeBook(enterText(scanner));
        System.out.println("The book has been successfully deleted!");
        System.out.println();
    }

    private static void exitingTheApplicationAndSavingToAFile(Library library,
                                                              LibraryRepository libraryRepository) {
        libraryRepository.writingToAFile(library.getBooks());
        System.out.println("Thank you!");
    }
}