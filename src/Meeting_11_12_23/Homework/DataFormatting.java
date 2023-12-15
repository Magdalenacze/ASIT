package Meeting_11_12_23.Homework;

public class DataFormatting {

    public static void main(String[] args) {

        double number1 = 10.0 / 6.0;

        System.out.println(number1);

        System.out.printf("Łańcuch formatowania na podstawie listy argumentów wynosi: %.2f\n", number1);

        System.out.println(String.format("Łańcuch formatowania na podstawie listy argumentów wynosi: %.2f", number1));

        // String.format -> rozwiązanie redundantne?

        /*

        Składnia specyfikatorów formatowania:

        %[opcje][szerokość][.precyzja]konwersja

        konwersja -> f dla double, d dla int

         */

        // Opcje:

        double number2 = 1234567.89;

        System.out.printf("%,f\n", number2);

        System.out.printf("%,.2f\n", number2);

        System.out.printf("%,15.2f\n", number2);

        System.out.printf("%015.2f\n", number2);

        System.out.printf("%-2f\n", number2);

        String name = "Magda";

        System.out.printf("%s\n", name);

        System.out.printf("%20s\n", name);
    }
}
