package Meeting_13_12_23.AdvancedExercises;

public class Palindrome_5 {

    public static void main(String[] args) {

        String palindrome = "ikar łapał raki";

        boolean palindroms;

        palindroms = isPalindrome(palindrome);

        System.out.println(palindroms);
    }

    public static boolean isPalindrome(String palindrome) {

        String sentence = palindrome.toLowerCase();

        for (int i = 0, j = sentence.length()-1; i < sentence.length(); i++, j--) {

            if (sentence.charAt(i) != sentence.charAt(j)) {

                return false;
            }
        }
        return true;
    }
}
