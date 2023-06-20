package Generics;

import java.util.List;

public class GenericsExercise {
/*
Erstelle eine generische Methode namens getMaxValue, die das größte Element in einer Liste von vergleichbaren Elementen zurückgibt.
Die Methode soll folgende Signatur haben:

public static <T extends Comparable<T>> T getMaxValue(List<T> list)
Die Methode soll die Liste durchlaufen und das größte Element basierend auf der natürlichen Ordnung (der Vergleichsmethode compareTo) finden und zurückgeben.

Hier ist ein Beispielcode, um dir den Einstieg zu erleichtern:

import java.util.List;

public class genericsExercise {

    public static <T extends Comparable<T>> T getMaxValue(List<T> list) {



    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 5, 8, 3, 12, 6);
        Integer maxNumber = getMaxValue(numbers);
        System.out.println("Größte Zahl: " + maxNumber);

        List<String> names = List.of("Alice", "Bob", "Charlie", "David");
        String maxName = getMaxValue(names);
        System.out.println("Längster Name: " + maxName);
    }
}
In diesem Beispiel wird die Methode getMaxValue verwendet, um das größte Element in einer Liste von Zahlen und den längsten Namen in einer
Liste von Strings zu finden. Die Methode getMaxValue ist generisch und kann daher mit verschiedenen Typen verwendet werden,
solange diese den Vergleich (Comparable) unterstützen.

Die Methode überprüft zuerst, ob die Liste leer ist, und wirft eine Ausnahme, falls dies der Fall ist.
Anschließend wird das erste Element der Liste als vorläufiges Maximum (max) festgelegt.
Die Methode durchläuft dann die Liste und vergleicht jedes Element mit dem aktuellen Maximum.
Wenn ein größeres Element gefunden wird, wird das Maximum aktualisiert. Am Ende wird das größte Element zurückgegeben.

Das Programm gibt die größte Zahl und den längsten Namen aus, die in den Listen gefunden wurden.
     */


    public static <T extends Comparable<T>> T getMaxValue(List<T> list) {
    if(list.isEmpty() || list == null){
        throw new IllegalArgumentException("Die Liste darf nicht leer oder null sein!");
    }
    T max = list.get(0);

    for(T index : list){
        if(index.compareTo(max) > 0){
            max = index;
        }
    }

    return max;
    }

        public static void main(String[] args) {
            List<Integer> numbers = List.of(10, 5, 8, 3, 12, 6);
            Integer maxNumber = getMaxValue(numbers);
            System.out.println("Größte Zahl: " + maxNumber);

            List<String> names = List.of("Alice", "Bob", "Charlie", "David", "Zi");
            String maxName = getMaxValue(names);
            System.out.println("Längster Name: " + maxName);
        }
    }

