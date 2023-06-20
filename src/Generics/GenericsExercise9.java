package Generics;

import java.util.List;

/*
Schreibe eine generische Methode printListInfo, die eine Liste von generischen Elementen als Parameter erhält und Informationen über die Liste ausgibt.
Die Methode soll die folgenden Informationen anzeigen:

Die Anzahl der Elemente in der Liste.
Den ersten und letzten Eintrag in der Liste.
Beispiel:


List<Integer> intList = List.of(1, 2, 3, 4, 5);
printListInfo(intList);
// Ausgabe: Anzahl der Elemente: 5
//          Erstes Element: 1
//          Letztes Element: 5

List<String> stringList = List.of("Hallo", "Welt");
printListInfo(stringList);
// Ausgabe: Anzahl der Elemente: 2
//          Erstes Element: Hallo
//          Letztes Element: Welt

Die Methode printListInfo sollte die gewünschten Informationen für die übergebene Liste ausgeben.

Hinweise:

Verwende einen Wildcard-Typ (List<?>) als Parameter, um mit Listen verschiedener generischer Typen arbeiten zu können.
Überprüfe, ob die Liste nicht null und nicht leer ist, bevor du auf die Elemente zugreifst.
Verwende die Methoden size() und get() der Liste, um die Anzahl der Elemente und die ersten und letzten Einträge zu ermitteln.
Versuche, diese Herausforderung anzugehen und schreibe den Code für die printListInfo-Methode. Wenn du Schwierigkeiten hast oder
weitere Hilfe benötigst, stehe ich gerne zur Verfügung.
 */
public class GenericsExercise9 {
    static void printListInfo(List<?> liste){
        System.out.println("Anzahl der Elemente: " + liste.size());
        System.out.println("Erstes Element: " + liste.get(0));
        System.out.println("Letztes Element: " + liste.get(liste.size()-1));
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        printListInfo(intList);

        List<String> stringList = List.of("Hallo", "Welt");
        printListInfo(stringList);
    }

}
