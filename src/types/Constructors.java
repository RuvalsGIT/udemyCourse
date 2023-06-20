package types;

import java.awt.*;

public class Constructors {
    // = eine Initialisierungsroutine, die ein Objekt in den Startzustand setzt
    // * Konstruktoren geben keinen Wert zurück
    // * Konstruktoren initialisieren nur das Objekt
    public static void main(String[] args) {


        Point p1 = new Point(); // Nicht Parametrisiert
        // -> public Point() {
        // this(0, 0);
        // }
        Point p2 = new Point(10, 20); // Parametrisiert
        // ->public Point(int x, int y) {
        //    this.x = x;
        //    this.y = y;
        //}


        // Wir testen den Standardkonstruktor:
        TV tv1 = new TV();
        System.out.println(tv1.toString()); // Ausgabe: TV{isOn=true, volume=20, channel=1}

        //Wir testen den parametrisierten Konstruktor
        TV tv2 = new TV(true,100,7);
        System.out.println(tv2.toString()); //TV{isOn=true, volume=100, channel=7}

        //Wir kopieren nun ein Objekt mithilfe des Copy Konstruktoren:
        TV tv3 = new TV(tv2);
        System.out.println(tv3.toString()); //TV{isOn=true, volume=100, channel=7}


    }
}