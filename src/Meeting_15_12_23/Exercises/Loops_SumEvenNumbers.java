package Meeting_15_12_23.Exercises;

import java.util.Arrays;

public class Loops_SumEvenNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++) {

            numbers[i] = i + 1;
        }
        System.out.println(Arrays.toString(numbers));

        int total = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {

                total += numbers[i];
            }
        }
        System.out.println(total);
    }
}
