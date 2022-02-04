package pl.edu.wszib.homework3;

import java.util.Arrays;
import java.util.Random;

public class CarCompany {

    public static Car[] motomachi = new Car[5000];
    public static Car[] tsutsumi = new Car[4500];
    public static Car[] tahara = new Car[1700];

    public static void main(String[] args) {

        String[] m = {"Yaris", "Corolla", "Aygo"};
        String[] c = {"silver", "blue", "black"};
        int[] y = {2018, 2019, 2020};

        Random random = new Random();

        for (int i = 0; i < motomachi.length; i++) {
            motomachi[i] = new Car(m[random.nextInt(m.length)], c[random.nextInt(m.length)], y[random.nextInt(m.length)]);
        }

        for (int i = 0; i < tsutsumi.length; i++) {
            tsutsumi[i] = new Car(m[random.nextInt(m.length)], c[random.nextInt(m.length)], y[random.nextInt(m.length)]);
        }

        for (int i = 0; i < tahara.length; i++) {
            tahara[i] = new Car(m[random.nextInt(m.length)], c[random.nextInt(m.length)], y[random.nextInt(m.length)]);
        }

        //count silver Toyota Yaris from 2020 in Motomachi
        int counter1 = 0;

        for (int i = 0; i < motomachi.length; i++) {
            if (motomachi[i].name == "Yaris") {
                if (motomachi[i].color == "silver") {
                    if (motomachi[i].year == 2020) {
                        counter1++;
                    }
                }
            }
        }
        System.out.println("Na parkingu fabryki Motomachi znajduje się obecnie " + counter1 + " srebrnych Toyot Yaris z rocznika 2020.");

        System.out.println("---------------------");
        //check which color is most popular in parking in Tsustumi factory.
        int counterSilver = 0;
        int counterBlue = 0;
        int counterBlack = 0;
        String mostPopularColor;

        for (int i = 0; i < tsutsumi.length; i++) {
            switch (tsutsumi[i].color) {
                case "silver":
                    counterSilver++;
                    break;
                case "blue":
                    counterBlue++;
                    break;
                case "black":
                    counterBlack++;
                    break;
            }
        }
        int[] counterArray = {counterSilver, counterBlue, counterBlack};
        Arrays.sort(counterArray);

        if (counterArray[2] == counterSilver) {
            mostPopularColor = "srebrny";
        } else if (counterArray[2] == counterBlue) {
            mostPopularColor = "niebieski";
        } else if (counterArray[2] == counterBlack) {
            mostPopularColor = "czarny";
        } else {
            mostPopularColor = "nierozstrzygnięte";
        }
        System.out.println("Najbardziej popularny kolor w fabryce Tsutsumi to " + mostPopularColor + " i liczy " + counterArray[2] + " aut.");

        System.out.println("---------------------");
        //first 10 cars Tahara factory parking

        System.out.println("Pierwsze dziesięć aut na parkingu Tahara to:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Toyota " + tahara[i].name + " z rocznika " + tahara[i].year);
            if (tahara[i].color == "silver") {
                System.out.println(" w kolorze srebrnym.");
            } else if (tahara[i].color == "blue") {
                System.out.println(" w kolorze niebieskim.");
            } else {
                System.out.println(" w kolorze czarnym.");
            }
        }


    }

}
