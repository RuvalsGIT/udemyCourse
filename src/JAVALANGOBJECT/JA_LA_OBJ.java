package JAVALANGOBJECT;

import java.awt.*;
import java.util.Objects;

public class JA_LA_OBJ {
    /**
    Methoden aus Java.Lang.Object die wird oft nutzen und überschreiben

     * toString()   = Gibt einen String aus dem Inhalt des Objekts zurück

     * equals(Obj)  = Prüft ob Objekte gleichwertige Zustände hat / Gibt Booleschen Wert zurück

     * hashCode()   = Ganzzahliger Wert der es schafft alle Zustände in einer Ganzzahl auszudrücken (Gibt HashCode eines Objektes zurück)

     * clone()      = Erstellt eine Kopie des Objektes und gibt dieses wieder zurück

     * getClass()   = Gibt die Laufzeit Klasse des Objektes zurück ( Wird nicht überschrieben)

     */

    public static void main(String[] args) {
        Object o1 = new Point(); // Wir machen ein neues Point Object
        Object o2 = "";          // Wir machen ein neues String Object
        System.out.println(o1.getClass()); // Ausgabe: java.awt.Point
        System.out.println(o2.getClass()); // Ausgabe: java.lang.String


        // Wir vergleichen ob die Klassen von 2 Objekten gleich sind:
        if(o1.getClass() == o2.getClass()){
            System.out.println("Gleicher Bauplan");
        }
        else{
            System.out.println("Ungleicher Bauplan");
        }
        // Ausgabe ist ungleicher Bauplan


        Radio r1 = new Radio();
        r1.isOn = true;
        r1.volume = 12;
        System.out.println(r1.hashCode());

        Radio r2 = new Radio();
        r2.isOn = true;
        r2.volume = 12;
        System.out.println(r2.hashCode());

        System.out.println(r1.equals(r2));

        Radio r3 = new Radio();
        r3.isOn = true;
        r3.volume = 13;
        System.out.println(r3.hashCode());

    }
}


// Wir bauen eine Vererbungshierarchie inklusive der überschriebenen toString-Methode auf:
class Thing{
    String name;

    @Override
    public boolean equals(Object o) {
        // 1. Abfrage is this Object gleichwertig mit dem Übergebenen Object? Return true
        if (this == o)
            return true;
        // 2. und 3. Abfrage: Ist das über gegebene Object Null? ODER sind die Typen ungleich? Return false
        if (o == null || getClass() != o.getClass()) // Es geht auch instanceof()!
            return false;


        Thing thing = (Thing) o;

        if (name != null ? !name.equals(thing.name) : thing.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Thing{" +
                "name='" + name + '\'' +
                '}';
    }
}
// Um die toString() Methode dynamisch zu halten. Implementieren wir ein super.toString();
class Appliance extends Thing{
    boolean isOn;
    double watt;

    @Override
    public boolean equals(Object o) {
        //1. Ist dieses Objekt identisch?
        if (this == o) return true;
        //2. Ist o Null ODER ist der Type ungleich? Return false
        if (o == null || getClass() != o.getClass()) return false;
        //3. Stimmen die geerbten Attribute überein? return false;
        if (!super.equals(o)) return false;
        //4. Ich prüfe, ob die unteren Eigenschaften gleich sind?
        Appliance appliance = (Appliance) o;
        // Bei Boolean ist es einfach, ist true & true ODER false & false?
        if (isOn != appliance.isOn) return false;
        // Für den Vergleich von Fließkommazahlen benötigen wir jedoch die Compare Methode, diese gibt eine 0 zurück, wenn beide gleich sind!
        return Double.compare(appliance.watt, watt) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (isOn ? 1 : 0);
        temp = Double.doubleToLongBits(watt);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "isOn=" + isOn +
                ", watt=" + watt +
                "} " + super.toString();
    }
}
// Auch hierbei wird sich auf das Super der Vorklasse bezogen
class Radio extends Appliance {
    int volume;

    @Override
    public boolean equals(Object o) {
        //1. Ist das übergebene Objekt gleichwertig? Vergleich mit sich selbst - Return true;
        if (this == o) return true;
        //2. Ist das Objekt Null ODER die Typen ungleich? Return false
        if (o == null || getClass() != o.getClass()) return false;
        //3. Sind die Super der Klassen ungleich? Return false
        if (!super.equals(o)) return false;

        //4. Vergleich, ob Volume gleich Volume entspricht
        Radio radio = (Radio) o;

        return volume == radio.volume;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + volume;
        return result;
    }

    @Override
    public String toString() {
        return "Radio{" +
                "volume=" + volume +
                "} " + super.toString();
    }
}

