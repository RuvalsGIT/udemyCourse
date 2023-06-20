package OOP;

/** Welche Sichtbarkeitstypen gibt es?
 * public -> ist für alle Sichtbar -> auch außerhalb der Klasse!
             ! Sollen die Eigenschaften, Methode und Attribute nutzbar sein müssen die ebenfalls public sein!
 * private -> ist nur in der Klasse sichtbar
 * protected -> nur im selben Java-Packet oder Sub-Klasse sichtbar
 * kein Modifier -> default -> nur aus der Klasse oder dem entsprechenden Packet darauf zugegriffen werden
 */

public class Sichtbarkeiten {
    public static void main(String[] args) {

// Um dies zum Umgehen, erstellen wir eine zusätzliche Methode, die darauf zugreift.
        Line.longLine();
    }
}

class Line {
    private static void line(){
        System.out.println("___________");

    }

    public static void longLine(){
        Line.line();
    }
}

