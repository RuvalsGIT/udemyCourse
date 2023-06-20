package JAVALANGOBJECT;

import java.util.*;

public class Person implements Comparable<Person> {
    /*
    Aufgabe:
Erstelle eine Klasse namens Person, die die Attribute name, alter und gehalt enthält.
Implementiere die Klasse so, dass Person das Interface Comparable<Person> implementiert.
Die Sortierung der Personen soll in aufsteigender Reihenfolge des Alters erfolgen.
Wenn zwei Personen das gleiche Alter haben, soll die Sortierung anhand des Gehalts erfolgen.

Schreibe dann einen Vergleichs-Comparator namens GehaltsComparator, der die Personen anhand des Gehalts in absteigender Reihenfolge vergleicht.

Erstelle eine Liste von Personen und fülle sie mit einigen Beispieldaten.
Sortiere die Liste sowohl mit der natürlichen Sortierung (unter Verwendung von Comparable) als auch mit dem GehaltsComparator.
Gib die sortierte Liste auf der Konsole aus, um sicherzustellen, dass die Sortierung korrekt ist.
     */

private String name;
private int alter;
private double gehalt;

public Person(String name, int alter, double gehalt){
    this.name = name;
    this.alter = alter;
    this.gehalt = gehalt;
}

public String getName(){
    return name;
}

public int getAlter(){
    return alter;
}

public double getGehalt(){
    return gehalt;
}



    @Override
    public int compareTo(Person o) { //compareTo Methode wird aus dem Comparable<Person> Interface überschrieben
        if(this.alter == o.alter){   //wenn das Alter gleich ist, soll der Compare Wert aus dem Gehalt gezogen werden
            return Double.compare(this.gehalt, o.gehalt);
        }

        else{
            return Integer.compare(this.alter, o.alter);
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                ", gehalt=" + gehalt +
                '}';
    }
}

class GehaltsComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return Double.compare(o1.getGehalt(), o2.getGehalt());
    }


    public static void main(String[] args) {
    List<Person> personen = new ArrayList<>();

    personen.add(new Person("Max",25,3500));
    personen.add(new Person("Anna",30,4000));
    personen.add(new Person("Tom", 27,3200));
    personen.add(new Person("Lisa", 25, 3700));

        Collections.sort(personen);
        for(Person person : personen){
            System.out.println(person);
        }

    }
}