package pl.edu.wszib.testpackage1;

public class PackageTester {
    public void introduce() {
        System.out.println("nazwa pakietu to: " + this.getClass().getPackageName());//dobijamy się do klasy, w której jesteśmy
    }
}
