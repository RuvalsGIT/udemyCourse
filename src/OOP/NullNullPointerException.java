package OOP;

import javax.swing.*;

public class NullNullPointerException {
    public static void main(String[] args) {
        // um System.out.println durchführen zu können, müssen variablen initialisiert werden

        int i = 12; // Primitiver Datentyp wird mit dem Wert 12 initialisiert

        String s = "Hallo"; // Hierbei deklarieren wir den Referenz-Variable s und initialisieren sie mit einem Objekt "Hallo"
        java.awt.Point p = null; // null = 0 Referenz -> kein Objekt! ->  können nicht auf Eigenschaften zurückgreifen!
        System.out.println(s); // Ergebnis: Hallo
        System.out.println(p); // Ergebnis: null

        /*
        System.out.println(s.length()); // Wir greifen auf die Eigenschaft Länge von s zu. Ergebnis: 5
        System.out.println(p.length()); // <- Compiler Fehler!
        */

        // Wie umgehe ich das?
        if (p != null) {
            System.out.println(s.length());
        } else {
            System.out.println("p == null");

        }
            String input = JOptionPane.showInputDialog("Eingabe");
            //  Klasse: JOptionPane
            // GUI (Graphic User Interface) Klasse aus dem javax.swing-Paket
            // Methode showInputDialog <- zeigt Eingabe-Dialog
            // bei Cancellation oder Abbruch der Dialogeingabe wir der Wert null zurückgegeben
            if (input != null) {
                System.out.println(input.length());
            } else {
                System.out.println(input == null);
            }
        }
    }
