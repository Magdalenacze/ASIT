package Meeting_11_12_23.AdvancedExercises;

public class MaxValue_2 {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        int highest;

        highest = getMaxValue(numbers);

        System.out.println(highest);
    }
    public static int getMaxValue(int[] numbers) {

        int highest = numbers[0];

        for (int index = 1; index < numbers.length; index++) {

            if (numbers[index] > highest) {

                highest = numbers[index];
            }
        }
        return highest;
    }
}
