package pl.edu.wszib.exceptions;

public class AgeTester {
    static void checkAge(int age) {
        if (age < 18) {
            throw new AgeRangeException("Uwaga! Osoba niepełnoletnia!");
        } else {
            System.out.println("Dostęp przyznany.");
        }
    }

    public static void main(String[] args) {
        checkAge(45);
        System.out.println("---------");
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Naruszenie zasad! " + e.getMessage());
        }
    }
}
