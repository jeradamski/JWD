public class Lab8_2 {
    public static void main(String[] args) {
        char [][][] arr = new char[3][3][3];

        arr[0][0][0] = 'A';
        arr[0][0][1] = 'B';
        arr[0][0][2] = 'C';
        arr[0][1][0] = 'D';
        arr[1][0][0] = 'E';
        arr[2][0][0] = 'Z';
        arr[2][1][0] = 'G';

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[j].length ; k++) {
                    //if (null == arr[i][j][k]) {} //TODO
                        System.out.println("arr[" + i + "][" + j + "][" + k + "]" + arr[i][j][k]);


                }
            }
        }



 /*       System.out.println("arr[0][0][0] = " + arr[0][0][0] );
        System.out.println("arr[0][0][1] = " + arr[0][0][1] );
        System.out.println("arr[0][0][1] = " + arr[0][0][1] );
        System.out.println("arr[0][0][1] = " + arr[0][0][1] );*/




    }
}
