package Meeting_29_01_24.Homework;

import Meeting_29_01_24.Homework.library.Library;
import Meeting_29_01_24.Homework.library.User;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        User user = new User();
        Library library = new Library();
        library.startOfTheEntireLibrarySystem(user);
        user.closeScanner();
    }
}
