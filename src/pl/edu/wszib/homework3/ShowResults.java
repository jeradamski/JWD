package pl.edu.wszib.homework3;

public class ShowResults {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(3);
        Rectangle rectangle3 = new Rectangle(3,5);

        System.out.println(rectangle1.area());
        System.out.println(rectangle2.area());
        System.out.println(rectangle3.area());

    }
}
