package Meeting_15_12_23.Exercises;

import java.util.Arrays;

public class Arrays_Copying {

    public static void main(String[] args) {

        int[] numbers1 = {2, 9, 3, 7, 7, 8, 8};

        int[] numbers2 = new int[numbers1.length];

        for (int i = 0; i < numbers1.length; i++) {

            numbers2[i] = numbers1[i];
        }
        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        numbers2[2] = 999;

        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        int[] numbers3 = Arrays.copyOf(numbers1, numbers1.length);

        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers3));

        System.out.println(numbers1);
        System.out.println(numbers3);

        int[] numbers4 = numbers1;

        System.out.println(numbers1);
        System.out.println(numbers4);
    }
}
