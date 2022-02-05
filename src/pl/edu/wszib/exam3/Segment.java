package pl.edu.wszib.exam3;

import java.awt.*;

public class Segment {

//    Stwórz klasę reprezentującą odcienk o nazwie Segment. Klasa powinna przechowywać informacje o punkcie początkowym odcinka - startPoint,
//    oraz punkcie końcowym odcinka - endPoint. Do zdefiniowania punktów skorzystaj ze znanej klasy Point z pakietu java.awt. Klasa powinna dostarczać konstruktor,
//    którego parametrami są 4 liczby całkowite: x1, y1, x2, y2, gdzie x1 i y1 określają współrzędne punktu początkowego a x2 i y2 współrzędne punktu końcowego odcinka.
//    Stwórz dwie instancje klasy Segment i jednym wyrażeniem sprawdź czy porównywane obiekty to ten sam odcinek (wymagane przesłonięcie odpowiedniej metody).

    Point startPoint = new Point();
    Point endPoint = new Point();

    public Segment(int x1, int y1, int x2, int y2) {
        this.startPoint = startPoint;
        startPoint.x = x1;
        startPoint.y = y1;

        this.endPoint = endPoint;
        endPoint.x = x2;
        endPoint.y = y2;

    }
}
