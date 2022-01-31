package pl.edu.wszib.podyplomowe;

import pl.edu.wszib.testpackage1.PackageTester;

public class PackageTesterApp {
    public static void main(String[] args) {
        PackageTester pt1 = new PackageTester();
        pt1.introduce();
        pl.edu.wszib.testpackage2.PackageTester pt2 = new pl.edu.wszib.testpackage2.PackageTester();
        pt2.introduce();
        pl.edu.wszib.testpackage3.PackageTester pt3 = new pl.edu.wszib.testpackage3.PackageTester();
        pt3.introduce();
    }
}
