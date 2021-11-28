public class RangeLister {
    public static void main(String[] args) {
        RangeLister rl = new RangeLister();
        int[] range = rl.makeRange(2,33);
        rl.showRange(range);


    }
    //od 2 do 5 - > 5-2+1= 4, czyli 4 elementy
    int[] makeRange(int lower, int upper) {

        int[] range = new int[(upper - lower) + 1];
        for (int i = 0; i < range.length; i++) {
            range[i] = lower++;
        }
        return range;
    }

    void showRange(int[] range) {
        System.out.print("Tablica: [ ");
        for (int i = 0; i < range.length; i++) {
            System.out.print(range[i] + " ");
        }
        System.out.print("]");
    }

}
