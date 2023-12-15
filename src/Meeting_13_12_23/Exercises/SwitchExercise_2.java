package Meeting_13_12_23.Exercises;

import java.util.Scanner;

public class SwitchExercise_2 {

    public static void main(String[] args) {

        int number = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1, 2 or 3: ");

        number = scanner.nextInt();

        switch(number) {

            case 1 -> System.out.println("Entered 1");
            case 2 -> System.out.println("Entered 2");
            case 3 -> System.out.println("Entered 3");
            default -> System.out.println("The specified value is not 1, 2 or 3!");
        }
        scanner.close();
    }
}
