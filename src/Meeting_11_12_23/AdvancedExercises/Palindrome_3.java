package Meeting_11_12_23.AdvancedExercises;

public class Palindrome_3 {

    public static void main(String[] args) {

        String originalString = "ikar łapał raki";
        StringBuilder reversedString = new StringBuilder();

        reversedString.append(originalString);
        reversedString.reverse();

        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }
}
