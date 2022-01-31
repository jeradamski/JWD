package pl.edu.wszib.podyplomowe;

public class VisitCounter {
    private int counter;

    public void increment() { //jeżeli nie zapiszemy public to wtedy dostęp jest ograniczony tylko do jednego pakietu
        counter++;
    }

    @Override
    public String toString() {
        return "VisitCounter{" +
                "counter=" + counter +
                '}';
    }
}
