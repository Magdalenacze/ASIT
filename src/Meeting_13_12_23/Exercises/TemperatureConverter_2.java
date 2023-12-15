package Meeting_13_12_23.Exercises;

import java.io.IOException;
import java.util.Scanner;

public class TemperatureConverter_2 {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the temperature in \u00BAK: ");

        Scanner scanner = new Scanner(System.in);

        double tempK = scanner.nextDouble();

        if (tempK < 0.0) {

            System.out.println("The specified value is less than zero. Re-enter the temperature in \u00BAK: ");

        } else {

            double tempC = tempK - 273.15;

            System.out.println(String.format("The given temperature in Kelvin is: %.2f \u00BAC", tempC));

            }
        scanner.close();
    }
}