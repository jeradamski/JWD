import java.awt.*;

public class Lab9_2_FourDPoint extends Point{

    public static void main(String[] args) {

    int[] arr = create(1,2,3,4);
        Lab9_2_FourDPoint obj = new Lab9_2_FourDPoint();
        obj.show(arr);

    }



    static int[] create(int x, int y, int z, int t) {

        int[] obj = {x,y,z,t};

       return obj;
    }
    public void show(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
