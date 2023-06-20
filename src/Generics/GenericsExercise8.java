package Generics;

/*
Schreibe eine generische Methode findMaxElement, die ein Array von generischen Elementen als Parameter erhält und das größte Element im Array zurückgibt.
Das Array kann Elemente beliebigen Typs enthalten, solange sie miteinander vergleichbar sind (d.h., der generische Typ implementiert das Comparable-Interface).

Beispiel:

Integer[] intArray = { 4, 7, 2, 9, 1 };
Integer maxInt = findMaxElement(intArray);
System.out.println(maxInt); // Ausgabe: 9

String[] stringArray = { "abc", "def", "xyz" };
String maxString = findMaxElement(stringArray);
System.out.println(maxString); // Ausgabe: xyz
Die Methode findMaxElement sollte das größte Element im Array identifizieren und zurückgeben.

Hinweise:

Verwende einen generischen Typparameter <T> in der Methode, um mit verschiedenen generischen Typen zu arbeiten.
Überprüfe, ob das Array nicht leer ist, bevor du auf das erste Element zugreifst.
Verwende die Methode compareTo() des generischen Typs, um die Elemente zu vergleichen und das größte Element zu finden.
Initialisiere eine Variable (maxElement) mit dem ersten Element des Arrays und vergleiche dann jedes Element mit diesem, um das größte Element zu finden.
Versuche, diese Herausforderung anzugehen und schreibe den Code für die findMaxElement-Methode
 */
public class GenericsExercise8 {
    public static <T extends Comparable> T findMaxElement(T[] array) {
        T maxElement = array[0];
        for (T element : array) {
            if (element.compareTo(maxElement) > 0) {
                maxElement = element;
            }
        }
        return maxElement;
    }

    public static void main(String[] args) {


        Integer[] intArray = {4, 7, 2, 9, 1};
        Integer maxInt = findMaxElement(intArray);
        System.out.println(maxInt); // Ausgabe: 9

        String[] stringArray = {"abc", "def", "xyz"};
        String maxString = findMaxElement(stringArray);
        System.out.println(maxString);

    }
}