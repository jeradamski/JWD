public class NumbersTester {
    public static void main(String[] args) {
/*        byte a = 7;
        short b;
        int c;

        c = a;
        b = (short)c; //rzutowanie

        System.out.println(8765432);
        System.out.println((byte)8765432);*/

        int a = 5;
        double b = 13.5;

        double c = b / a; //niejawna konwersja zmiennej a
        int d = (int)b / a; //konieczne jawne rzutowanie

        //int -> Integer : boxing
        //Integer -> int : unboxing

        Float f1 = 12.5f;
        Float f2 = 27.2f;

        System.out.println(Math.min(f1,f2)); //niejawny unboxing, ponieważ Math.min przyjmuje float

    }
}
