package types;

public class StaticConstant {
    public static void main(String[] args) {

        // static = Drücken aus, dass sie nicht mit einer Instanz verbunden sind, sondern über verschiedene Instanzen gehen
        // -> sind übergeordnet und gelten für alle Objekte
        // -> Wir machen Methoden dann statisch, wenn Sie ihre Arbeitswerte aus den Parametern ziehen
        // -> und diese nicht auf Objektzustände zurückgreifen

        System.out.println(Math.PI); // PI ist statisch und final (oft miteinander kombiniert)
        System.out.println(Math.max(10,3000)); // Die Methode max aus der Klasse Math ist ebenfalls statisch
        // -> Sie arbeitet mit den Paramtern

        //1. Wir fügen unserer Radio Klasse eine statische Methode hinzu die Radionamen in Frequenzen konvertiert:

        // Da dies eine statische Methode ist, lässt diese sich mit den Parameter befüllen, unabhängig ob ein Objekt erstellt ist
        //->bzw. IntelliJ schlägt uns hierbei sogar vor, dass wir keine Objekt damit erstellen müssen.

        System.out.println(Radio.senderNameToFrequency("java"));
        // Ausgabe 101.0

        /**
         * Klassen sind immer Groß zu schreiben! (Siehe Math., Radio,System.,usw.)
         * Statische Methoden werden vom IntelliJ kursiv dargestellt
         * Objektvariablen werden kleingeschrieben
         * Man kann in einer statischen Methode nicht auf individuelle Objekteigenschaften zurückgreifen -> Parameter
         * this.Referenz funktioniert nicht bei statische Objekt. this.bezieht sich aufs aktuelle Objekt
         * Ist die Methode an ein individuelles Objekt gebunden? Nutzt diese Objekteigenschaften? <- nicht static
         * Ist die Methode nicht an ein Objekt gebunden, sondern arbeitet stehts mit Parametern? <- static
         */

    }
}
