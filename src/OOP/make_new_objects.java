package OOP;

public class make_new_objects {
    public static void main (String [] args){

        System.out.println(new java.awt.Point()); // AWT = ABSTRACT WINDOW TOOL KIT (Grafische Oberfläche)
        // Klasse Point repräsentiert Punkte, zweidimensional, gegeben mit x, y Koordinaten
        // Ergebnis: java.awt.Point[x=0,y=0]
        java.awt.Point p = new java.awt.Point();
        // Hierbei wird die Referenz-Variable p deklariert und mit dem Ergebnis der Objekterzeugung initialisiert
        // Nach der Deklarierung der Variable, enthält diese einen Verweis auf das Objekt
        // Diese Referenz-Variable können wir nutzen, um auf Objekteigenschaften zugreifen zu können

        p.x = 10;
        // Auf die Eigenschaften (Methoden und Attribute) (x=0, y=0) lassen sich nun mit dem "." zugreifen.
        System.out.println(p.x);
        // Ergebnis: 10

        p.setLocation(11, 22);
        // Wir rufen die Methode setLocation auf und setzen die Koordinaten neu
        System.out.println(p.toString());
        //Ergebnis: java.awt.Point[x=11,y=22]
        // mit der Method toString können wir wichtige debug-Informationen erhalten
        // kompakte Repräsentation der Zustände zu erfragen
        // println gibt diese aber automatisch als toString aus

        String s = p.toString(); // wir erstellen eine neuen String S. Dieser beinhaltet "java.awt.Point[x=11,y=22]"
        System.out.println(s.length()); // wir lassen mit der Methode length uns die Länge anzeigen E: 25

        System.out.println(p.toString().length());
        //verkürzte Schreibweise!

        java.awt.Polygon polygon = new java.awt.Polygon();
        // Referenztyp           =   Objekttyp
    }
}
