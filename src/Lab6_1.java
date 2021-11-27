import java.util.Date;
import java.util.StringTokenizer;

public class Lab6_1 {
    public static void main(String[] args) {
        String date = "01/12/2021";
        String day = date.substring(0,2);
        String month = date.substring(3,5);
        String year = date.substring(6,10);

        System.out.println("dzień: " + day + ", miesiąc: " + month + ", rok: " + year);

        StringTokenizer st = new StringTokenizer(date,"/");
        System.out.println("\n" + st.nextToken());
        System.out.println(st.nextToken());
        System.out.println(st.nextToken());
    }
}
