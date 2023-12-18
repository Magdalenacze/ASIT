package Meeting_15_12_23.AdvancedExercises;

import java.util.Arrays;

public class Matrix_MaxValue {

    public static void main(String[] args) {

        int[][] numbers = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15} };

        int highest = numbers[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers[i].length; j++) {

                if (numbers[i][j] > highest) {

                    highest = numbers[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("Maximum value is: " + highest +
                "\nMaximum value has indexes: " + row + " " + col);
    }
}
