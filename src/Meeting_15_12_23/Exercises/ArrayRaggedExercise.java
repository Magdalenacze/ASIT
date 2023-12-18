package Meeting_15_12_23.Exercises;

import java.util.Arrays;

public class ArrayRaggedExercise {

    public static void main(String[] args) {

        int[][] ragged = new int[3][];

        ragged[0] = new int[3];
        ragged[1] = new int[]{1, 2, 3, 4, 5};
        ragged[2] = new int[2];

        System.out.println(Arrays.deepToString(ragged));
    }
}
