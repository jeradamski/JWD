public class Shop {
    public static void main(String[] args) {
        Product p1 = new Product("Mleko", 3.28);
        Product p2 = new Product("Mleko", 3.27);

        System.out.println(p1.equals(p2)); //standardowo daje false, nawet przy identycznych wartościach.
        // Należy utworzyć metodę equals w klasie produkt
        System.out.println(p1);
    }
}
