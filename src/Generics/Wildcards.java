package Generics;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
    List<Double> liste = new ArrayList<>();
    liste.add(2345.345);
    liste.add(25.35);
    liste.add(2.34);
        System.out.println(dblSum(liste));
    }

    //Wir wollen aus einer Liste von Double Werten eine Summe bilden.

    static double dblSum(List<Double> liste){
        double sum = 0;
        for( Double element : liste ){
            sum = element + sum;
        }
        return sum;
    }
}
