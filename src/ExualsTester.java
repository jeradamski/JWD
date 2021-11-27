public class ExualsTester {
    public static void main(String[] args) {
        String str1, str2;
        str1 = "Ala ma kota";
        str2 = str1;

        System.out.println("String 1 " + str1 + ", String 2 " +str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));

        str2 = new String(str1); //tworzę nowy obiekt

        System.out.println("String 1 " + str1 + ", String 2 " +str2);
        System.out.println("Ten sam obiekt? " + (str1 == str2));

        System.out.println("Ta sama wartość? " + str1.equals(str2));

        System.out.println();
        System.out.println(str1.getClass());
        System.out.println(str1.getClass().getName());

        boolean check1 = "Teksas" instanceof String; //weryfikacja typu zmiennej
        System.out.println(check1);

        Object obj = new Object();
        boolean check2 = obj instanceof String;
        System.out.println(check2);

        boolean check3 = "dsadas" instanceof Object;
        System.out.println(check3);


    }
}
