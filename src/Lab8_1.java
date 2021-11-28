public class Lab8_1 {
    public static void main(String[] args) {
        int[] arr = {4, 1, 1, 4, 2, 3, 4, 4, 1, 2, 4, 9, 3,6,6,6,6,6,6,6,6,6,6};
        int[] count = new int[10];
        int max = 0;
        int nbr = 0;

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
            }
        for (int i = 0; i < count.length; i++) {
            if (count[i]>max) {
                max=count[i];
                nbr=i;
            }
        }
        System.out.println(max);
        System.out.println(nbr);
    }
}
