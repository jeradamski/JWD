public class Variables {
    public static void main(String[] args) {

        int bokKwadratu1 = 2;
        int bokKwadratu2 = 7;
        int bokKwadratu3 = 11;
        int bokKwadratu4 = 19;

        VariablesApp kwadrat = new VariablesApp();

        System.out.println("Kwadrat 1");
        kwadrat.obliczPole(bokKwadratu1);
        kwadrat.obliczObwod(bokKwadratu1);
        kwadrat.obliczPrzekatna(bokKwadratu1);
        System.out.println();

        System.out.println("Kwadrat 2");
        kwadrat.obliczPole(bokKwadratu2);
        kwadrat.obliczObwod(bokKwadratu2);
        kwadrat.obliczPrzekatna(bokKwadratu2);
        System.out.println();

        System.out.println("Kwadrat 3");
        kwadrat.obliczPole(bokKwadratu3);
        kwadrat.obliczObwod(bokKwadratu3);
        kwadrat.obliczPrzekatna(bokKwadratu3);
        System.out.println();

        System.out.println("Kwadrat 4");
        kwadrat.obliczPole(bokKwadratu4);
        kwadrat.obliczObwod(bokKwadratu4);
        kwadrat.obliczPrzekatna(bokKwadratu4);
        System.out.println();
        
    }
}
