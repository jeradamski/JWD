public class Lab7_2 {
    public static void main(String[] args) {

        String str = "1110000110000101100101000000";
        System.out.println(str);

        long nbr = 0;

        for (int i = 0; i < str.length(); i++) {

            int a = Character.getNumericValue(str.charAt(i));
            int pos = str.length()-i-1;
            double calc = a*Math.pow(2, pos);

            nbr += calc;

            //System.out.println(a + ", " + pos + ", " + calc + ", " + nbr);
        }
        System.out.println(nbr);
    }
}
