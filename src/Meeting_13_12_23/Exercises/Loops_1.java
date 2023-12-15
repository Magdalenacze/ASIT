package Meeting_13_12_23.Exercises;

public class Loops_1 {

    public static void main(String[] args) {

        int[] person = {1, 2, 3, 4, 5, 6};

        int index = 0;

        while (index < person.length) {

            System.out.println(person[index]);
            index++;
        }
        index = 0;

        do {

            System.out.println(person[index]);
            index++;
        }
        while (index < person.length);
    }
}
