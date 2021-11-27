import java.sql.SQLOutput;

public class VariablesApp {

   void obliczPole (int bokKwadratu) {
        int pole = bokKwadratu*bokKwadratu;
        System.out.println("Pole kwadratu wynosi: "+pole);
    }
    void obliczObwod (int bokKwadratu) {
        int obwod = bokKwadratu*4;
        System.out.println("Obwód kwadratu wynosi:" +obwod);
    }
    void obliczPrzekatna (int bokKwadratu) {
        double przekatna = bokKwadratu*Math.sqrt(2);
        System.out.println("Przekątna kwadratu wynosi:"+przekatna);
    }
}
