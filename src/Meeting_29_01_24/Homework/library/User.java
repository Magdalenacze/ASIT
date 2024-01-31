package Meeting_29_01_24.Homework.library;

import java.util.InputMismatchException;
import java.util.Scanner;

public class User {
    Scanner scanner;

    public User() {
        this.scanner = new Scanner(System.in);
    }

    public void closeScanner() {
        scanner.close();
    }

    public int chooseOptionFromTheMainMenu() {
       int choiceFromTheMainMenu = -1;

            do {
                try {
                    choiceFromTheMainMenu = scanner.nextInt();
                } catch (InputMismatchException ex) {
                    scanner.nextLine();
                }
            } while (choiceFromTheMainMenu != 1 && choiceFromTheMainMenu != 2 &&
                    choiceFromTheMainMenu != 3 && choiceFromTheMainMenu != 4 &&
                    choiceFromTheMainMenu != 5 && choiceFromTheMainMenu != 6 &&
                    choiceFromTheMainMenu != 0);
        return choiceFromTheMainMenu;
    }

    public int chooseOptionFromTheSearchMenu() {
        int choiceFromTheSearchMenu = -1;

            do {
                try {
                    choiceFromTheSearchMenu = scanner.nextInt();
                } catch (InputMismatchException ex) {
                    scanner.nextLine();
                }
            } while (choiceFromTheSearchMenu != 1 && choiceFromTheSearchMenu != 2 &&
                    choiceFromTheSearchMenu != 3);
        return choiceFromTheSearchMenu;
    }

    public String enterText() { // auxiliary method
        String textInput;

            do {
                textInput = scanner.nextLine();
            } while (textInput.isEmpty());
        return textInput;
    }
}
