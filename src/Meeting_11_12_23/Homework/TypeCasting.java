
package Meeting_11_12_23.Homework;

public class TypeCasting {

    public static void main(String[] args) {

        /*

        Ścisła kontrola typów -typy danych zmiennej i wartości muszą być takie same!

        Hierarchia; byte -> short -> int -> long -> float -> double

         Konwersja poszerzająca zakres - automatycznie na typ z wyższego poziomu
         hierarchii

         Konwersja zawężająca zakres - nie zostanie wykonana automatycznie ze
         względu na utratę precyzji

        */

        int a;
        double b = 2.5;
        // x = y; brak kompilacji, bo możliwa utrata precyzji ze względu na zapisanie wartości typu double w zmiennej typu int

        int c;
        short d = 2;
        c = d; // kompilacja powiedzie się, bo niższy typ na wyższy

        System.out.println(c);

        double e;
        int f = 10;
        e = f;

        System.out.println(e);

        int g = 10, h = 4;
        double i;
        i = g / h;

        System.out.println(i); // utrata precyzji, bo wynik powienien być 2.5

        // lub i = (double) (g / h) -> rozwiązanie redundantne/zbędne

        i = (double)g / h;

        System.out.println(i);

        i = g / (double)h;

        System.out.println(i);
    }
}