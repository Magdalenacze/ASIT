package Meeting_15_12_23.Exercises;

import java.util.Arrays;

public class Arrays_InPlaceMethod {

    public static void main(String[] args) {

        int[] numbers = {2, 9, 3, 6, 5};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 10);

        System.out.println(Arrays.toString(numbers));
    }
}
