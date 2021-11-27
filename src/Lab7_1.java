import java.util.Scanner;

public class Lab7_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź liczbę całkowitą - ");
        int n = scanner.nextInt();

        System.out.println("Macierz liczby " + n + " wygląda następująco:" );
        int j = 0;
        while (n > j) {
            for (int i = j; i < (j+n); i++) {
                System.out.print(1 + i + " ");
            }
            System.out.print("\n");
            j++;
        }
    }
}

