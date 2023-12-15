package Meeting_11_12_23.AdvancedExercises;

public class MaxValue_1 {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        int highest = numbers[0];

        for (int index = 1; index < numbers.length; index++) {

            if (numbers[index] > highest) {

                highest = numbers[index];
            }
        }
        getMaxValue(highest);
    }
    public static void getMaxValue(int maxValue) {

        System.out.println(maxValue);
    }
}
