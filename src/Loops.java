public class Loops {
    public static void main(String[] args) {

        int x = 5;

        if (x > 0) {
            System.out.println("Większe od zera");
        }

        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Ok");
                break;
            case 'B':
                System.out.println("Srednio");
                break;
            default:
                System.out.println("Popraw się");
                break;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        boolean cond = true;

        while (cond){
            System.out.println("Pętla działa.");
            if ( (int)(Math.random() * 50 + 1) == 20) {
                cond = false;
            }
        }

        cond = false;

        do {
            System.out.println("Pętla działa");
        } while (cond);

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i);
            System.out.print(" ");
        }

        out: for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(i + j + " ");
                if (i==5 && j==5) {
                    break out;
                }
            }
            System.out.println();
        }

    }
}
