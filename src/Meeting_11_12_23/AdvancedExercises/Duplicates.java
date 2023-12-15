package Meeting_11_12_23.AdvancedExercises;

import java.util.Arrays;

public class Duplicates {

    public static void main(String[] args) {

        int[] numbers = {1, 4, 7, 10, 2, 5, 8, 8, 3, 6, 9, 9};

        Arrays.sort(numbers);

        boolean duplicates;

        duplicates = containsDuplicates(numbers);

        System.out.println(duplicates);
    }

    public static boolean containsDuplicates(int[] numbers) {

    int lastValue = numbers[0];

        for (int index = 1; index < numbers.length; index++) {

            if (lastValue == numbers[index]) {

                return true;
            }
            lastValue = numbers[index];
        }
        return false;
    }
}
