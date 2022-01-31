package pl.edu.wszib;

public class InstanceCounter {
    private static int numIntances = 0;

    public static int getCount() {
        return numIntances;
    }

    private static void addInstance() {
        numIntances++;
    }

    public InstanceCounter() {
        addInstance();
    }

    public static void main(String[] args) {
        InstanceCounter ic = new InstanceCounter();
        ic = new InstanceCounter();
        ic = new InstanceCounter();
        ic = new InstanceCounter();
        ic = new InstanceCounter();

        System.out.println(getCount());
    }
}
