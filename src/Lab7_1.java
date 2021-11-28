import java.util.Scanner;

public class Lab7_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę całkowitą większą od 1 i mniejszą od 30 ");
        int n = scanner.nextInt();

        if (n > 30 || n<1) {
            System.out.print("Błędna wartość. Wprowadź jeszcze raz.");
            n = scanner.nextInt();
        }

        System.out.println("Macierz liczby " + n + " wygląda następująco:" );
        int j = 0;
        while (n > j) {
            for (int i = j; i < (j+n); i++) {
                System.out.printf("%3s",1 + i + " ");
            }
            System.out.print("\n");
            j++;
        }
    }
}

