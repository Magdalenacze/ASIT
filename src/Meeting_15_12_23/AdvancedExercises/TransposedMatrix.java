package Meeting_15_12_23.AdvancedExercises;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TransposedMatrix {

    public static void main(String[] args) throws IOException {

        try (Scanner scanner = new Scanner(System.in)) {

            int numberOfRows;
            int numberOfColumns;

            System.out.println("Enter the number of rows for the matrix: ");
            numberOfRows = scanner.nextInt();

            System.out.println("Enter the number of columns for the matrix: ");
            numberOfColumns = scanner.nextInt();

            int[][] matrix = new int[numberOfRows][numberOfColumns];

            for (int row = 0; row < matrix.length; row++) {

                for (int col = 0; col < matrix[row].length; col++) {

                    System.out.println("Provide a value for the row and column at index: " + row + col);
                    matrix[row][col] = scanner.nextInt();
                }
            }
            showMatrix(matrix);
            System.out.println();
            showTransposedMatrix(matrix);
        }
    }

    public static void showMatrix(int[][] arr) {

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                System.out.print(arr[row][col] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static void showTransposedMatrix(int[][] arr) {

        int[][] transposedMatrix = new int[arr[0].length][arr.length];

        for (int row = 0; row < arr.length; row++) {

            for (int col = 0; col < arr[row].length; col++) {

                transposedMatrix[col][row] = arr[row][col];
            }
        }

        for (int row = 0; row < transposedMatrix.length; row++) {

            for (int col = 0; col < transposedMatrix[row].length; col++) {

                System.out.print(transposedMatrix[row][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}
