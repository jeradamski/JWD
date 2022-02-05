package pl.edu.wszib.exceptions;

public class ExceptionThrowDemo {
    public static void main(String[] args) {
        ExceptionThrowDemo etd = new ExceptionThrowDemo();
        int hours = -5;
        int numberOfSeconds = 0;

        try {
            numberOfSeconds = etd.getNumbersIfSeconds(hours);
        } catch (IllegalArgumentException e) {
            System.out.println("Uwaga! Korekta danych werjściowych");
            numberOfSeconds = etd.getNumbersIfSeconds(hours * -1);
        }

        System.out.println(numberOfSeconds);

    }

    public int getNumbersIfSeconds(int hours) {
        if (hours < 0) {
            throw new IllegalArgumentException("Wartość godzin musi być większa lub równa 0. " + hours);
        }
        return hours * 60 * 60;
    }
}
