public class Lab7_1 {
    /*
Napisz program, który dla dowolnej liczby całkowitej n z przedziału (1 ≤ n ≤ 30) wypisuje macierz
jak w poniższych przykładach. Użyj dwóch zagnieżdżonych pętli.
    */
    public static void main(String[] args) {
        int n = 5;
        int j = 1;

        while (n < j) {
            for (int i = j; i <= n; i++) {
                System.out.print(i + " ");
            }
            System.out.print("\n");
            j++;
        }
    }
}

