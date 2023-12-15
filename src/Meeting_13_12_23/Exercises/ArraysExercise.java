package Meeting_13_12_23.Exercises;

import java.util.Arrays;

public class ArraysExercise {

    public static void main(String[] args) {

        int[] array1 = new int[3];
        double[] array2 = new double[4];
        boolean[] array3 = new boolean[5];
        String[] array4 = new String[6];

        System.out.println(array1[0]);
        System.out.println(array2[0]);
        System.out.println(array3[0]);
        System.out.println(array4[0]);
        System.out.println(Arrays.toString(array4));
        System.out.println(array4[array4.length - 1]);
    }
}
