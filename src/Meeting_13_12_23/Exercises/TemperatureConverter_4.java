package Meeting_13_12_23.Exercises;

import java.io.IOException;
import java.util.Scanner;

public class TemperatureConverter_4 {
    public static void main(String[] args) throws IOException {

        System.out.println("Choose 1 or 2: ");
        System.out.println("<1> conversion C -> F");
        System.out.println("<2> conversion K -> C");

        try (Scanner scanner = new Scanner(System.in)) {

            int choice = scanner.nextInt();

            if (choice != 1 && choice != 2) {

                System.out.println("An error occured!");
            } else {

                System.out.println("Enter the temperature: ");

                double temp = scanner.nextDouble();

                switch (choice) {
                    case 1 -> convertCToF(temp);
                    case 2 -> convertKToC(temp);
                    default -> System.out.println("Your choice is: " + choice + ". You have to choose 1 or 2: ");
                }
            }
        }
    }

    public static void convertCToF(double tempC) {

        if (tempC < 273.15) {

            System.out.println("Incorrect temperature entered! " +
                    "Must be greater than or equal to 273.15");
        } else {

            double tempF = 32.0 + 9.0/5.0 * tempC;

            System.out.println("%.2f\u00BAC = %.2f\u00BAF\n".formatted(tempC, tempF));
        }
    }

    public static void convertKToC(double tempK) {

        if (tempK < 0) {

            System.out.println("Incorrect temperature entered! " +
                    "Must be greater than or equal to zero");
        } else {

            double tempC = tempK - 273.15;

            System.out.println("%.2fK = %.2f\u00BAC\n".formatted(tempK, tempC));
        }
    }
}