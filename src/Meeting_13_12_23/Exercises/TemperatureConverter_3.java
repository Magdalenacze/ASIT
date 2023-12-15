package Meeting_13_12_23.Exercises;

import java.io.IOException;
import java.util.Scanner;

public class TemperatureConverter_3 {

    public static void main(String[] args) throws IOException {

        int input;

        try (Scanner scanner = new Scanner(System.in)) {

            do {

                System.out.println("If you want to convert from \u00BAC to \u00BAF - enter 1:\n" +
                        "If you want to convert from Kelvin to \u00BAC - enter 2:\n" +
                        "if you want to finish - enter 0: ");

                input = scanner.nextInt();
            }

            while (input != 0 && input != 1 && input != 2);

            if (input == 1) {

                double tempC;

                System.out.println("Enter the temperature in \\u00BAC: ");

                tempC = scanner.nextDouble();

                double tempF = 32.0 + 9.0/5.0 * tempC;

                System.out.println("The given temperature in degrees Celsius is: " + tempF + " \u00BAF");

            } else if (input == 2) {

                double tempK;

                System.out.println("Enter the temperature in \u00BAK: ");

                tempK = scanner.nextDouble();

                double tempC = tempK - 273.15;

                System.out.println("The given temperature in Kelvin is: " + tempC + " \u00BAC");
            } else {

                System.out.println("Thank you!");
            }
        }
    }
}