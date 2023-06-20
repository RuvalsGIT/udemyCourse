package Generics;

import java.util.ArrayList;
import java.util.List;

/*
Schreibe eine generische Methode mergeLists, die zwei Listen vom gleichen Typ als Parameter erhält.
Die Methode soll eine neue Liste zurückgeben, die aus der Kombination der Elemente beider Listen besteht,
wobei die Elemente abwechselnd aus den beiden Listen entnommen werden.

Beispiel:


List<String> list1 = List.of("A", "B", "C");
List<String> list2 = List.of("1", "2", "3");

List<String> mergedList = mergeLists(list1, list2);
System.out.println(mergedList); // Ausgabe: [A, 1, B, 2, C, 3]
Die Methode mergeLists sollte eine neue Liste erzeugen, die abwechselnd die Elemente aus list1 und list2 enthält.
In diesem Beispiel wird "A" aus list1, dann "1" aus list2, dann "B" aus list1, "2" aus list2, "C" aus list1 und schließlich "3" aus list2
 n die Ergebnisliste aufgenommen.

Hinweise:

Verwende Wildcards (?) in den Typparametern, um mit unterschiedlichen generischen Typen zu arbeiten.
Erzeuge eine neue ArrayList, um die kombinierte Liste zu speichern.
Verwende Schleifen, um durch beide Listen zu iterieren und die Elemente abwechselnd hinzuzufügen.
Beachte, dass die beiden Listen die gleiche Länge haben sollten, da sonst Elemente übrig bleiben könnten.
Versuche, diese Herausforderung anzugehen und schreibe den Code für die mergeLists-Methode. Wenn du Schwierigkeiten hast oder weitere Hilfe benötigst, stehe ich gerne zur Verfügung.
 */
public class GenericsExcercise7 {
    static List<?> mergeList(List<?> liste1, List<?> liste2){
    List<Object>mergedList = new ArrayList<>();
    int size = Math.max(liste1.size(), liste2.size());

    for( int i = 0; i < size; i++){
        mergedList.add(liste1.get(i));
        mergedList.add(liste2.get(i));
        }

    return mergedList;
    }
}
