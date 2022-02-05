package pl.edu.wszib.exam3;

public class SegmentChecker {

    public static void main(String[] args) {

        Segment segment = new Segment(1,1,2,2);
        Segment segment2 = new Segment(2,1,2,2);

        if (segment.startPoint.equals(segment2.startPoint) && segment.endPoint.equals((segment2.endPoint))) {
            System.out.println("Wskazane odcinki są takie same.");
        } else System.out.println("Wskazane odninki NIE są takie same.");
    }


}
