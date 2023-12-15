package Meeting_11_12_23.Exercises;

public class StringsExercise {

    public static void main(String[] args) {

        String first = "Ala zna Jave";
        String second = "Ala zna Jave";
        String third = new String("Ala zna Jave");

        System.out.println(first == second);
        System.out.println(first == third);

        System.out.println(first.equals(second));
        System.out.println(third.equals(second));
    }
}
