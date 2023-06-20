package Generics;

import java.util.ArrayList;
import java.util.List;

/*Schreibe eine generische Methode mergeLists, die zwei Listen mit generischen Elementen als Parameter erhält und eine neue Liste zurückgibt,
 die alle Elemente aus beiden Listen enthält, wobei Duplikate entfernt werden.

Die Reihenfolge der Elemente in der neuen Liste spielt keine Rolle.

Beispiel:


List<Integer> list1 = List.of(1, 2, 3, 4);
List<Integer> list2 = List.of(3, 4, 5, 6);
List<Integer> mergedList = mergeLists(list1, list2);
System.out.println(mergedList); // Ausgabe: [1, 2, 3, 4, 5, 6]

List<String> list3 = List.of("a", "b", "c");
List<String> list4 = List.of("b", "c", "d", "e");
List<String> mergedList2 = mergeLists(list3, list4);
System.out.println(mergedList2); // Ausgabe: [a, b, c, d, e]
Die Methode mergeLists sollte eine neue Liste erstellen, die alle Elemente aus list1 und list2 enthält, wobei Duplikate entfernt werden.

Hinweise:

Verwende Wildcard-Typen (List<?>) für die Parameter, um mit Listen verschiedener generischer Typen arbeiten zu können.
Erstelle eine neue leere Liste, um die kombinierten Elemente aufzunehmen.
Füge alle Elemente aus list1 in die neue Liste ein.
Füge alle Elemente aus list2 in die neue Liste ein, wenn sie nicht bereits vorhanden sind.
Verwende die Methode contains() der neuen Liste, um zu überprüfen, ob ein Element bereits enthalten ist.
Beachte, dass die Reihenfolge der Elemente in der neuen Liste keine Rolle spielt.
Versuche, diese Herausforderung anzugehen und schreibe den Code für die mergeLists-Methode.

 */
public class GenericsExercise10 {
public static List<Object> mergeLists(List<?> list1, List<?> list2){

    if(list1 == null || list2 == null){
        throw new IllegalArgumentException("Listen dürfen nicht null sein!");
    }
    if(list1.isEmpty() || list2.isEmpty()){
        throw new IllegalArgumentException("Listen dürfen nicht leer sein!");

    }

    List<Object> mergedList = new ArrayList<>();
    int size = Math.max(list1.size(), list2.size());

    for(int i = 0; i < size; i++){
        if(i<list1.size()){
            mergedList.add(list1.get(i));
        }
        if(i<list2.size()){
            mergedList.add(list2.get(i));
        }
    }

    return mergedList;
}

    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(3, 4, 5, 6);
        List<Object> mergedList = mergeLists(list1, list2);
 

    }
}
