package Meeting_11_12_23.Exercises;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TemperatureConverter_1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the temperature in \u00BAC: ");

        Scanner scanner = new Scanner(System.in);

        double tempC = scanner.nextDouble();

        double tempF = 32.0 + 9.0/5.0 * tempC;

        scanner.close();

        System.out.println("The given temperature in degrees Celsius is: " + tempF + " \u00BAF");

        PrintWriter printWriter = new PrintWriter(new FileWriter("file.txt", true));
        printWriter.println(String.format("%.2f\u00BAC = %.2f\u00BAF", tempC, tempF));
        printWriter.close();

    }
}