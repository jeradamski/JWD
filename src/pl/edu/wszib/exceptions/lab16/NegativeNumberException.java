package pl.edu.wszib.exceptions.lab16;

public class NegativeNumberException extends ArithmeticException{

    public NegativeNumberException() {
    }

    public NegativeNumberException(String s) {
        super(s);
    }
}
