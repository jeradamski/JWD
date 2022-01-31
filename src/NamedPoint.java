import java.awt.*;

public class NamedPoint  extends Point {
    String name;

    public NamedPoint(int x, int y, String name) {
        super(x, y);
        this.name = name;
    }
    public void showInfo() {
        System.out.println(name + "(" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        NamedPoint namedPoint = new NamedPoint(5,5, "SmallPoint");
        System.out.println("x wynosi " + namedPoint.x + " y wynosi " + namedPoint.y + " name to " + namedPoint.name);
        System.out.println();
        namedPoint.showInfo();

        namedPoint = new NamedPoint(123,3443, "BigPoint");
        namedPoint.showInfo();

    }
}
