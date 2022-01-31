public class Division {
    double divide(int a, int b, int c) {
        return a / b / c;
    }

    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        double result;

        Division division = new Division();
        result = division.divide(a,b,c);

        System.out.println("Wynik dzielenia wskazanych liczb to " + result);
    }
}
