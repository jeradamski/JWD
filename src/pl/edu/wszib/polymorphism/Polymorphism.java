package pl.edu.wszib.polymorphism;

public class Polymorphism {

    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println(rectangle instanceof Shape);
        shape = new Rectangle();
        shape = new Triangle();
        shape.draw();



    }

}
