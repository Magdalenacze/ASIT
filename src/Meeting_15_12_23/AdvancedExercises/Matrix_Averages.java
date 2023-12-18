package Meeting_15_12_23.AdvancedExercises;

import java.util.Arrays;

public class Matrix_Averages {

    public static void main(String[] args) {

        int[][] numbers = { {1, 2, 3, 4},
                            {5, 6, 7, 8},
                            {9, 10, 11, 12} };

        int[] result = new int[numbers[0].length];

        int total;

        for (int col = 0; col < numbers[0].length; col++) {

            total = 0;

            for (int row = 0; row < numbers.length; row++) {

                total += numbers[row][col];
            }
            result[col] = total / numbers.length;
        }
        System.out.println(Arrays.toString(result));
    }
}
