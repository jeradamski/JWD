import java.awt.*;

public class RefTester {
    public static void main(String[] args) {
        Point pt1, pt2;

        pt1 = new Point(100, 100);
        pt2 = pt1;

        pt1.x = 200;
        pt1.y = 150;

        System.out.println(pt2);

    }
}
