package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/*
Aufgabe: Generische Methode zur Konvertierung

Schreibe eine generische Methode mit dem Namen convertList, die eine Liste von Elementen eines bestimmten Typs in eine Liste
von Elementen eines anderen Typs konvertiert. Die Methode soll die konvertierte Liste zurückgeben.

Die Methode sollte folgende Signatur haben:


public static <T, U> List<U> convertList(List<T> list, Function<T, U> converter)
Hinweise:

Die Methode erhält eine Eingangsliste list und eine Funktion converter, die ein Element vom Typ T entgegennimmt und ein Element vom Typ U zurückgibt.
Die Methode soll jedes Element in der Eingangsliste mithilfe der converter-Funktion konvertieren und die konvertierten Elemente in einer neuen Liste
vom Typ U sammeln.
Du kannst die generische Funktion Function<T, U> aus dem java.util.function-Paket verwenden, um den Konverter zu definieren.
Du kannst die Methode List.add() verwenden, um die konvertierten Elemente zur neuen Liste hinzuzufügen.
 */
public class GenericsExercise4 {
    public static <T,U> List<U> convertList(List<T> liste, Function<T,U> converter){
        List<U> uListe = new ArrayList<>();

        for(T element : liste){
            U uElement = converter.apply(element);
            uListe.add(uElement);
        }

        return uListe;

    }

    public static void main(String[] args) {
        List<Integer> liste = List.of(10,20,30,40,50);

        List<String> liste2 = convertList(liste,Object::toString);

        System.out.println(liste2.toString());
    }
}
