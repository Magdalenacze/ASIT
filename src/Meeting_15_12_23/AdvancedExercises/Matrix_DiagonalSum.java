package Meeting_15_12_23.AdvancedExercises;

import java.util.Arrays;

public class Matrix_DiagonalSum {

    public static void main(String[] args) {

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = i + j;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        System.out.println(diagonalSum(matrix));
    }

    public static int diagonalSum(int[][] matrix) {

        int total = 0;

        for (int i = 0; i < matrix.length; i++) {

            total += matrix[i][i];
        }
        return total;
    }
}
