package pl.edu.wszib.lab4;

public class Cat extends Animal{

    private static String type = "kot";
    private static int counter;

    public Cat() {
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
