public class Overriding_Lab {

    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        Boy boy = new Boy();
        boy.eat();

    }


    static class Human {
        void eat() {
            System.out.println("human");
        }
    }
    static class Boy extends Human {
        void eat() {
            System.out.println("boy");
        }
    }
}
