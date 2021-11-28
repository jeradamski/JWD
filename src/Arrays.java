import java.awt.*;

public class Arrays {
    public static void main(String[] args) {

        int[] temps = new int[99];
        temps[0] = 23;
        temps[45] = 78;

        int[] a = new int[2];
        a = new int[]{0, 1};

        System.out.println(temps[45]);

        Point[] points = {new Point(1,1), new Point(2,2), new Point(0,0)};

        System.out.println(points[1]);

        Point p = new Point(5,5);
        points[1] = p;

        System.out.println(points[1]);

        points[1].y = 9;
        System.out.println(points[1]);

        int[][] arr = new int[2][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 3;
        arr[1][1] = 4;

        int[][] arr2 = {{1,2},{3,4}};

        int[] arr3 = {1, 234, 43432, 564 };

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(i + ", " + arr3[i]);
        }

        for (int e: arr3) {
            System.out.println(e);
        }



    }
}
