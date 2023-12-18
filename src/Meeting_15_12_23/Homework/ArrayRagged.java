package Meeting_15_12_23.Homework;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayRagged {

    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in)) {

            int input;

            do {

                System.out.println("Enter any integer greater than zero: ");

                input = scanner.nextInt();
            }
            while (input <= 0);

            int[][] ragged = new int[input][];

            for (int i = 0; i < ragged.length; i++) {

                ragged[i] = new int[i + 1];

                for (int j = 0; j < i + 1; j++) {

                    ragged[i][j] = j + 1;
                }
            }
            showArrayRagged(ragged);
            System.out.println();
            showAverages(ragged);
        }
    }

    public static void showArrayRagged(int[][] arr) {

        for (int row = 0; row < arr.length; row++) {

            System.out.println(Arrays.toString(arr[row]));
        }
    }

    public static void showAverages(int[][] arr) throws IOException {

        double[] result = new double[arr.length];

        int total;

        for (int row = 0; row < arr.length; row++) {

            total = 0;

            for (int col = 0; col < arr[row].length; col++) {

                total += arr[row][col];
            }
            result[row] = (double) total / arr[row].length;
        }

        PrintWriter printWriter = new PrintWriter(new FileWriter("file1.txt", true));

        for (int index = 0; index < result.length; index++) {

            System.out.println("średnia(" + Arrays.toString(arr[index]) + ") = " + String.format("%.2f", result[index]) + "\t");

            printWriter.println("średnia(" + Arrays.toString(arr[index]) + ") = " + String.format("%.2f", result[index]) + "\t");
        }
        printWriter.close();
    }
}
