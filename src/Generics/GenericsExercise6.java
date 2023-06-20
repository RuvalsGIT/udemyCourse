package Generics;
/*
Schreibe eine generische Methode countMatchingElements, die zwei Listen als Parameter erhält. Die Methode soll die Anzahl der Elemente zählen,
die in beiden Listen vorkommen. Die Elemente müssen nicht in derselben Reihenfolge auftreten, sondern nur in beiden Listen vorhanden sein.

Die Methode sollte einen int-Wert zurückgeben, der die Anzahl der übereinstimmenden Elemente repräsentiert.

Beispiel:

List<String> list1 = List.of("Apfel", "Banane", "Erdbeere", "Orange");
List<String> list2 = List.of("Banane", "Orange", "Kiwi");

int count = countMatchingElements(list1, list2);
System.out.println(count); // Ausgabe: 2
In diesem Beispiel haben die Listen list1 und list2 zwei übereinstimmende Elemente ("Banane" und "Orange").

Hinweise:

Du kannst Wildcards (?) in den Typparametern verwenden, um generische Methoden zu schreiben, die mit unterschiedlichen Typparametern arbeiten können.
Verwende eine Schleife, um durch eine der Listen zu iterieren und prüfe, ob jedes Element auch in der anderen Liste vorkommt.
Du kannst die Methode contains() verwenden, um zu überprüfen, ob ein Element in einer Liste enthalten ist.
Zähle die übereinstimmenden Elemente und gib das Ergebnis zurück.
 */

import java.util.List;

public class GenericsExercise6 {
    public static int countMatchingElements(List<?> liste1, List<?> liste2){
        int counter = 0;
        for(Object element : liste1){
            if(liste2.contains(element)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        List<String> list1 = List.of("Apfel", "Banane", "Erdbeere", "Orange");
        List<String> list2 = List.of("Banane", "Orange", "Kiwi");

        System.out.println(countMatchingElements(list1, list2));
    }
}
