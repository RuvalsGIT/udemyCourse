package Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*Schreibe eine generische Methode namens countOccurrences, die die Anzahl der Vorkommen eines bestimmten Elements in einer Liste zählt.
Die Methode soll folgende Signatur haben:

public static <T> int countOccurrences(List<T> list, T element)
Die Methode soll die Liste durchlaufen und zählen, wie oft das angegebene Element in der Liste vorkommt.
Sie soll die Anzahl der Vorkommen als Ganzzahl zurückgeben.

*/
public class GenericsExercise2 {
    public static <T> int countOccurrences(List<T> liste, T element){
        if(liste.isEmpty() || liste == null || element == null){
            throw new IllegalArgumentException("Fehler bei den Argumenten!");
        }

        int counter = 0;

        for(T index : liste){
            if(index.equals(element)){
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        List <Integer> liste1 = List.of(10,20,30,40,10,10);

        List <String> liste2  = List.of("Vale","Zoe","Vale","Zoe","Zoe","Hallo");

        System.out.println(countOccurrences(liste1,10));
        System.out.println(countOccurrences(liste2,"Zoe"));
    }
}
