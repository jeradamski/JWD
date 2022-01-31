/*
public class Overrider {
    public static void main(String[] args) {

        B b = new B("Jakiś parametr");

    }
}

class A {
    public A() {
        super();
        System.out.println("Działa konstruktor A()");
    }
    public A(String param) {
        System.out.println("Działa konstruktor A(param)");
    }
}

class B extends A {
    public B() {
        super(); //Tego nie trzeba pisać. Jest domyślne.
        System.out.println("Działa konstruktor B()");
    }
    public B(String param) {
        super(param); //dziedziczenie powiązane z konstruktorami. Super z argumentem odwołuje się do konstruktora z parametrem
        System.out.println("Działa konstruktor B(param)");
    }
}
*/
