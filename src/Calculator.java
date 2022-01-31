public class Calculator {
    int add (int a, int b) {
        return a + b;
    }
    int add (int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    double add(double a, double b, double c) {
        return a + b + c;
    }
    double add (int a, double b) {
        return a + b;
    }
    double add (double a, int b) {
        return a + b;
    }
    double add (int a, double b, int c) {
        return a + b + c;
    }
    double add (double a, int b, int c) {
        return a + b + c;
    }
    double add (int a, int b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 5));
        System.out.println(calculator.add(5, 5, 8));
        System.out.println(calculator.add(5.4, 5.6, 8.6));
        System.out.println(calculator.add(5.5, 5.3));
        System.out.println(calculator.add(5.5, 1));
    }
}
