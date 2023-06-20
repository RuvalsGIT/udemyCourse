package JAVALANGOBJECT;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassUbungGPT {
/*
Schreibe eine Java-Methode mit dem Namen calculateSum, die eine Liste von Integer-Werten als Parameter erhält
und die Summe aller Elemente in der Liste berechnet. Die Methode soll die Summe als int zurückgeben.

Verwende Wrapper-Klassen, um die Integer-Werte in der Liste zu repräsentieren.
Du kannst die Methode parseInt der Wrapper-Klasse Integer verwenden, um einen String in einen Integer umzuwandeln.

Hier ist ein Beispielaufruf der Methode calculateSum:

List<String> stringList = Arrays.asList("10", "20", "30");
List<Integer> integerList = new ArrayList<>();

for (String str : stringList) {
    integerList.add(Integer.parseInt(str));
}

int sum = calculateSum(integerList);
System.out.println("Summe: " + sum);
Die Ausgabe sollte wie folgt sein:

Summe: 60
     */

public static int calculateSum(List<Integer> list){
    if(list.isEmpty()){
        throw new IllegalArgumentException("Liste darf nicht null enthalten!");
    }

    int sum = 0;
    for(Integer i : list ){
        sum = sum +i;
    }

    return sum;
}

    public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();

    list.add(10);
    list.add(20);
    list.add(30);


    System.out.println("Summe: " + calculateSum(list));

    }
}
