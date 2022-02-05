package pl.edu.wszib.lab4;

import java.util.Random;

public class AnimalShelter {

    private static final int PEN_NUMBER = 33;

    public static void main(String[] args) {
        Animal[] animals = new Animal[100];
        Random random = new Random();


        for (int i = 0; i < animals.length; i++) {
            int r = random.nextInt(3);
            switch (r) {
                case 0:
                    animals[i] = new Dog();
                    break;
                case 1:
                    animals[i] = new Cat();
                    break;
                case 2:
                    animals[i] = new Hamster();
                    break;
            }
        }
//
//        for (Animal a: animals) {
//            System.out.println(a.getType());
//        }

        Animal animal = animals[PEN_NUMBER-1];

        System.out.println(animal.getType());
        System.out.println(animal.getInstanceNumber());

    }
}
