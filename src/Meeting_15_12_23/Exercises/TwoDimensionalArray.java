package Meeting_15_12_23.Exercises;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] numbers = { {1, 2, 3}, {1, 2, 3} };

        System.out.println("The number of rows in an initialized two-dimensional array is: " + numbers.length);

        for (int index = 0; index < numbers.length; index++) {

            System.out.println("Number of columns in row number " + (index + 1) + " is: " + numbers[index].length);
        }
        System.out.println(Arrays.deepToString(numbers));
    }
}
