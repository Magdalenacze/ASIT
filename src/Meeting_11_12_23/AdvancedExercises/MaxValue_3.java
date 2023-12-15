package Meeting_11_12_23.AdvancedExercises;

import java.util.HashMap;
import java.util.Map;

public class MaxValue_3 {

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        //int highest;

        Map map = getMaxValue(numbers);
        Result result = new Result(Integer.parseInt(map.get(new String("value")).toString()),
                Integer.parseInt(map.get(new String("index")).toString()));

        System.out.println("Maksymalna wartość dla obiektu wynosi: " + result.getMaxValue() +
                " , a jej indeks to: " + result.getMaxIndex());
    }
    public static Map getMaxValue(int[] numbers) {

        int highest = numbers[0];

        int indexMaxValue = 0;

        for (int index = 1; index < numbers.length; index++) {

            if (numbers[index] > highest) {

                highest = numbers[index];

                indexMaxValue = index;
            }
        }
        Map result = new HashMap();
        result.put(new String("index"), indexMaxValue);
        result.put(new String("value"), highest);

        //Result result = new Result(highest, indexMaxValue);

        return result;
    }
}
