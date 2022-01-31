package pl.edu.wszib.zabezpieczony2;

import pl.edu.wszib.zabezpieczony.A;

public class B extends A {
    public static void main(String[] args) {
        B b = new B();
        b.number = 1;
        b.name = "Tom";
    }
}

class C {
    void test() {
        B b = new B();
        b.number = 1;
        //b.name = "asdsa";
    }
}
