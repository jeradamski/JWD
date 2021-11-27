import java.util.Locale;

public class StringFormatter {
    public static void main(String[] args) {
        int accountBalance = 33_023;

        System.out.println(accountBalance);

        System.out.printf("Saldo: %,d zł%n", accountBalance);

        // %[flags][width][.precision]conversion-character
        // s formats strings
        // d formats decimal integers
        // f formats floating numbers
        // t formats date time
        // bB formats boolean

        double pi = Math.PI;

        System.out.println("\n" + pi);

        System.out.printf(new Locale("us"),"%.3f%n", pi);
    }
}
