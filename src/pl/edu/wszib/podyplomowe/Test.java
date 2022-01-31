package pl.edu.wszib.podyplomowe;

import pl.edu.wszib.java.PackagePresenter;

public class Test {
    public static void main(String[] args) {
        System.out.println("Pakiet: " + Test.class.getPackageName());

        PackagePresenter pp1 = new PackagePresenter();
        pp1.showPackage();

        pl.edu.wszib.podyplomowe.PackagePresenter pp2 = new pl.edu.wszib.podyplomowe.PackagePresenter();
        pp2.showPackage(); //w jednym projekcie mogą istnieć klasy o tych samych nazwach. Wystarczy wrzucić do
        //osobnego pakietu. Powyższej wywołanie dwóch osobnych klas. Drugie wywołanie musi być z całą ścieżką,
        // ale IDE podpowiada.
    }
}
