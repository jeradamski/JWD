import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Point p = new Point(1,3);
        System.out.println(p.toString());

        MarsRobot marsRobot = new MarsRobot("test", 1,2);
        System.out.println(marsRobot);

        Employee employee = new Employee("Jurek", 30,33333);
        System.out.println(employee);
    }
}
