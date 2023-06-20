package OOP;

// * Heap <- Speicherbereich in dem Java seine Objekte ablegt
// * OutOfMemoryError <- wenn ich mehr Speicher erfrage, als mein Heap groß ist erhalte ich einen OutOfMemoryError
// * Garbage Collector <- Objekte die nicht mehr Referenziert werden von Java automatisch gelöscht / Automatische Speicherbereinigung

public class Speicherverwaltung {
    public static void main (String [] args){
      /*
        java.util.Stack stack = new java.util.Stack(); // Ist eine Datenstruktur die immer Daten aufeinander stapelt

        // Wir simulieren ein Erreichen des Endes vom Heap Speichers

        while (true) { // Endlosschleife
        new java.awt.Point();
        }
       */

        // Garbage-Collector:
        java.awt.Point p = new java.awt.Point(); // p wird darunter neu initialisiert -> JVM kann diesen Code löschen
        p = new java.awt.Point(); // hiermit kann die JVM weiter arbeiten!
        p = null; // nun wird die obere Zeile nicht mehr benötigt und der GarbageCollector löscht diesen

        //Garbage Collector ist ein Thread, der prüft, ob eine Referenz erreichbar ist, wenn diese nicht mehr erreichbar ist,
        // wird die Referenz nicht mehr erreicht, löscht er diese aus dem Hauptspeicher
    }
}
