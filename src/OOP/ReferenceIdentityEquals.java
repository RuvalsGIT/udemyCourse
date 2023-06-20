package OOP;

public class ReferenceIdentityEquals {
    public static void main(String[] args) {

        // Wir erstellen eine variable p (Typ java.awt.Point) = ein Objekt vom Typ java.awt.Point();
        java.awt.Point p = new java.awt.Point();
        java.awt.Point q = new java.awt.Point();
        java.awt.Point r = p;
        // Wir haben 3 variablen (p,q,r) erstellt und 2 Objekte!

        // Wir prüfen, ob diese 3 variablen gleich (==) zueinander sind
        System.out.println(p==q); // false
        System.out.println(p==r); // true
        System.out.println(q==r); // false

        // obwohl p und q die gleichen Koordinaten haben (x=0, y=0),
        // zeigen sie auf 2 unterschiedliche Objekte
        // r und p zeigen auf dasselbe Objekt und sind somit korrekt!


        // Wir nutzen somit den Begriff Gleichwertigkeit, um die Werte verschiedener Objekte zu prüfen
        // Diese Methode nennt sich -> equals

        System.out.println(p.equals(q)); // true
        System.out.println(q.equals(r)); // true

        /** Methoden Variablen / Objekte miteinander zu vergleichen:
         * == gleich
         * != ungleich
         * equals(objekt oder "String")
         * !equals(objekt oder "String")
         */

        String input1 = new java.util.Scanner(System.in).nextLine();
        String input2 = new java.util.Scanner(System.in).nextLine();

        System.out.println(input1.equals(input2)); // bei gleicher Eingabe -> True Sonst ->False

    }
}
