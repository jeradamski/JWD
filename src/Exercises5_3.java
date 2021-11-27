public class Exercises5_3 {
    public static void main(String[] args) {

        //1
        System.out.println("ćwiczenie 1");

        double invest = 14_000;
        invest = ((invest * 1.4) - 1500) * 1.12;

        System.out.println("Inwestycja po trzech latach była warta: " + Math.round(invest) + "zł.");

        //2
        System.out.println();
        System.out.println("ćwiczenie 2");

        long nbr = 36;
        modulo(nbr);

        //3
        System.out.println();
        System.out.println("ćwiczenie 3");


        long a = 7;
        String bin = String.format("%8s", Long.toBinaryString(a)).replace(' ', '0');
        System.out.println(bin);

        int n = 7;
        n = 8 - n;
        bin = bin.substring(n, n + 1);
        System.out.println(bin);

        //---------------------------------
        System.out.println();

        int number = 3;
        int bitPosition = 2;
        int mask = 1 << bitPosition;
        boolean result = (number & mask) > 0;

        System.out.print("Dla liczby " + number + " na " + bitPosition + " pozycji ");
        System.out.print(result ? "jest" : "nie jest");
        System.out.println(" ustawiony bit.");

        System.out.println(String.format("%32s", Integer.toBinaryString(mask)).replace(' ', '0'));
        System.out.println(String.format("%32s", Integer.toBinaryString(number)).replace(' ', '0'));


    }


    public static void modulo(long number) {

        long calcOne = number % 7;
        long calcTwo = number % 5;
        boolean calc = calcOne == 0 && calcTwo == 0;

        System.out.println(calc);

    }


}
