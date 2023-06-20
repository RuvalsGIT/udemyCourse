package JAVALANGOBJECT;

import java.util.ArrayList;

public class WrapperClassesAutoboxing {
    /* Was sind Wrapper Klassen?
    Das sind Klassen, die es für jeden primitiven Datentyp gibt.

    Aufgaben von WrapperKlassen:
    1. Utility Methoden - Methoden mit dem "." aufgerufen werden können.
    2. Können als Bauplan für Instanzen genutzt werden. (Primitives Element kann ich eine Box gesetzt werden)
    3. Nutzung des Typs / Generics

    Wie kann ich WrapperKlassen aufbauen?
    1. statische valueOf(...) Methoden
    2. Boxing
    3. Konstruktoren / <- Das ist aber deprecated und könnte bald entfernt werden
     */

    public static void main(String[] args) {

        //Hierbei rufen wir die Methode isDigit von der WrapperKlasse Character auf:
        System.out.println(Character.isDigit('0'));

        Character c = Character.valueOf('#');
        System.out.println(c);

        // Wir erstellen eine ArrayList von Typ Integer
        ArrayList <Integer> list = new ArrayList<>(); // Achtung hier muss der Typ immer die WrapperKlasse sein!

        // Wir fügen der ArrayList vom Typ Integer, ein Objekt vom Typ Integer mit dem Wert 12 hinzu.
        list.add(Integer.valueOf(12));

        //Autoboxing = Boxing + Unboxing (Wurde eingeführt)
        //Boxing (Box = Wrapper, Primitiver Datentyp = Inhalt der geboxt wird)
        Character c1 = 'a'; // <- bei einem char zu Character funktioniert das Boxing!
        Integer i1 = 12; // <- bei Integer und 12 klappt es auch, weil 12 eine Ganzzahl im bereich Integer ist!
        Long l1 = 12L;  // <- Hier wird zwingend benötigt, dass es ein long ist, nur 12 geht nicht!

        //Unboxing (Primitiver Datentyp wird aus dem Wrapper genommen und einer variable zu gewiesen)
        char c2 = c1;
        int i2 = i1;
        long l2 = l1;

        //Autoboxing
        i1 = i1 + 1; // Hierbei entnimmt der Compiler den primitiven Datentyp aus i1 und addiert eine 1 dazu und boxt ihn wieder ein.

        Integer no1 = 1;
        Integer no2 = 1;
        Integer no3 = 1000;
        Integer no4 = 1000;

        
    }
}
