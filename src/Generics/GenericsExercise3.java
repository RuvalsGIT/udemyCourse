package Generics;

import java.util.List;

/*
Aufgabe: Maximalen Wert in einer generischen Liste finden

Schreibe eine generische Methode mit dem Namen findMaxValue, die den maximalen Wert in einer gegebenen Liste von Elementen findet.
Die Methode soll den maximalen Wert zurückgeben.

Die Methode sollte folgende Signatur haben:

public static <T extends Comparable<T>> T findMaxValue(List<T> list)
Hinweise:

Die Methode soll die Comparable-Schnittstelle verwenden, um die Elemente miteinander zu vergleichen.
Du kannst davon ausgehen, dass die Liste nicht leer ist und dass alle Elemente der Liste den Comparable-Typ implementieren.
Du kannst die compareTo-Methode verwenden, um die Elemente zu vergleichen und den maximalen Wert zu ermitteln.
 */
public class GenericsExercise3 {
public static <T extends Comparable<T>> T findMaxValue(List<T> list){
    T maxValue = list.get(0);
    for(T element : list){
        if(element.compareTo(maxValue) > 0){
            maxValue = element;
        }
    }
    return maxValue;
}

    public static void main(String[] args) {
        List<Integer> liste = List.of(10,30,892,1231,80,213,492,122);
        List<String>  liste2= List.of("A","B","C","F","K","Z","R");

        System.out.println(findMaxValue(liste));
        System.out.println(findMaxValue(liste2));

    }
}
