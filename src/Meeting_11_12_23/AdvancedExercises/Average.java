package Meeting_11_12_23.AdvancedExercises;

public class Average {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        double average;

        average = getAverage(numbers);

        System.out.println(average);
    }
    public static double getAverage(int[] numbers) {

        double total = 0.0;
        double average = 0.0;

        for (int index = 0; index < numbers.length; index++) {

            total += numbers[index];
            average = total / numbers.length;
        }
        return average;
    }
}
