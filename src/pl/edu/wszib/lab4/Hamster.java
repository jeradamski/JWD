package pl.edu.wszib.lab4;

public class Hamster extends Animal {

    private static String type = "chomik";
    private static int counter;

    public Hamster() {
        counter++;
    }

    @Override
    String getType() {
        return type;
    }

    @Override
    int getInstanceNumber() {
        return counter;
    }
}
