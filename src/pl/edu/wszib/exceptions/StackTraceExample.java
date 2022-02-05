package pl.edu.wszib.exceptions;

public class StackTraceExample {
    public static void main(String[] args) {
        StackTraceExample ste = new StackTraceExample();
        ste.method1();

    }

    public void method1() {
        method2();
    }

    private void method2() {
        method3();
    }

    private void method3() {
        throw new RuntimeException("Przykładowy wyjątek!");
    }


}
