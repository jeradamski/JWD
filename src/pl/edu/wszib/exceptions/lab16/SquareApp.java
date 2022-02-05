//        Napisz program, który pobierze od użytkownika liczbę i wyświetli jej pierwiastek. Do obliczenia pierwiastka możesz użyć istniejącej
//        metody java.lang.Math.sqrt(). Jeśli użytkownik poda liczbę ujemną rzuć wyjątek java.lang.IllegalArgumentException. Obsłuż sytuację, w
//        której użytkownik poda ciąg znaków, który nie jest liczbą.

package pl.edu.wszib.exceptions.lab16;

import java.util.Scanner;

public class SquareApp {
    public static void main(String[] args) {

        double nmb = 0;

        try {
            nmb = Double.parseDouble(args[0]);
            double square = Math.sqrt(nmb);

            if (nmb < 0) {
                throw new IllegalArgumentException();
            } else System.out.println("Pierwiastek z " + nmb + "wynosi " + square);

        } catch (NumberFormatException e) {
            System.out.println("błąd parsowania!");
            System.exit(-1);
        }

    }
}
