package types;

import java.util.ArrayList;

public class Associations {
/**
 * Beziehungen = Assoziationen
 * Ein Objekt kann auf ein anderes Objekt verweisen und darauf zugreifen
 * Eine hat oder kennt Beziehung
 *
 */

public static void main(String[] args) {
    // Wir lernen eine neue Datenstruktur ArrayList
    ArrayList<String> list = new ArrayList<String>(); // Wir deklarieren und initialisieren eine neue ArrayList
    list.add("Hallo"); // Zu dieser Liste fügen wir etwas hinzu.
    list.add("Hallo 2"); // Wir fügen wieder etwas hinzu.
   // System.out.println(list.get(0));
    for (String string : list){ // Nun machen wir eine for-each Schleife, die dafür sorgt, dass wir die Dateien ausgeben können
        System.out.println(string);
    }
}





}
class Cell {
    String value;
}

class Chessboard{
    Cell[] cells = new Cell[8*8];

}
