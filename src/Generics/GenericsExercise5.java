package Generics;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

/*
Aufgabe: Generische Methode zur Filterung

Schreibe eine generische Methode mit dem Namen filterList, die eine Liste von Elementen eines bestimmten Typs filtert
und nur die Elemente zurückgibt, die einem bestimmten Filterkriterium entsprechen.

Die Methode sollte folgende Signatur haben:

java
Copy code
public static <T> List<T> filterList(List<T> list, Filter<T> filter)
Hinweise:

Die Methode erhält eine Eingangsliste list und ein Filterobjekt filter, das die Filterkriterien definiert.
Das Filterobjekt sollte das generische Interface Filter<T> implementieren.
Das Interface Filter<T> sollte eine Methode boolean apply(T element) haben, die das Filterkriterium für ein gegebenes
Element überprüft und true zurückgibt, wenn das Element dem Kriterium entspricht, andernfalls false.
Die Methode filterList soll die Elemente in der Eingangsliste durchlaufen und nur diejenigen Elemente auswählen,
für die filter.apply(element) true zurückgibt, und sie in einer neuen Liste sammeln.
Du kannst die Methode List.add() verwenden, um die ausgewählten Elemente zur neuen Liste hinzuzufügen.
 */
public class GenericsExercise5 {
    public static <T> List<T> filterList(List<?> list, Class <T> type){
        List <T> filteredList = new ArrayList<>();


        for(Object element : list){
            if(element.getClass().equals(type)){
                T filteredElement = (T) element;
                filteredList.add(filteredElement);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        List <?> liste = List.of(10,"Hallo",30.5,"ich","mache","jetzt","Feierabend",300,500);

        List <Integer> list1 = filterList(liste,Integer.class);
        System.out.println(list1.toString());
        List <String> list2 = filterList(liste,String.class);
        System.out.println(list2.toString());
        List <Double> list3 = filterList(liste,Double.class);
        System.out.println(liste.toString());

    }
}
