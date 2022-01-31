//przy tworzeniu klasy można od razu określić pakiet, tj. pl.edu.wszib.java.PackagePresenter
package pl.edu.wszib.java;

public class PackagePresenter {

    public PackagePresenter() {
        System.out.println("testy");
    }

    public static void main(String[] args) {
        PackagePresenter packagePresenter = new PackagePresenter();
        packagePresenter.showPackage();

    }

    public void showPackage() {
        System.out.print("To jest obiekt klasy " + this.getClass().getSimpleName());
        System.out.println(", w pakiecie " + this.getClass().getPackage().getName());
    }
}
