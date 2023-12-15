package Meeting_11_12_23.AdvancedExercises;

import java.util.Arrays;

public class Palindrome_4 {

    public static void main(String[] args) {

        String originalString = "ikar łapał raki";
        StringBuilder reversedString = new StringBuilder();

        reversedString.append(originalString);
        reversedString.reverse();

        System.out.println(Arrays.equals(originalString.toCharArray(), reversedString.toString().toCharArray()));
    }
}
