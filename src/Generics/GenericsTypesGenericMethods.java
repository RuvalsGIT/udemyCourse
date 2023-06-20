package Generics;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GenericsTypesGenericMethods {
    /*
    //Wir erstellen eine Methode, die uns das erste Objekt (String) einer Liste wiedergibt.
    //Falls das erste Objekt Null ist, oder die Liste leer ist -> Default Wert wird ausgegeben.

    public static String firstOrElse(List <String> liste, String defaultValue){ //Hierbei Parametrisieren wir die Liste mit <String>
        if(liste.isEmpty()) {

            return defaultValue;
        }
        return liste.get(0); // Mit get(0) greifen wir auf das erste Element zu
    }
*/

    // Hierbei bauen wir die Methode so, dass es irrelevant ist welchen Typ wir verwenden.
    // Der Rückgabetyp <T> T kann jeden Typen nutzen und wiedergeben, genauso der defaultValue jeden Typ haben kann.
    // Somit ist die Methode dynamisch!
        static <T> T firstOrElse2 (List <T> list, T defaultValue) {
            if (list == null || list.isEmpty()) {
                return defaultValue;
            }
            return list.get(0);
        }

        static class Pair<T, U>{
        public final T first;
        public final U second;

            public Pair(T first, U second) {
                this.first = first;
                this.second = second;
            }
        }




    public static void main(String[] args) {

        int age;
        double income;
        String name;

        ArrayList <String> names;
        ArrayList <LocalDate> birthdays;

        /*
        * Originaltyp (engl. raw type)          Rocket
        * Parametrisierter Typ                  List<String>, List<Integer>....
        * Typargument (engl. Type parameter)    String, LocalDate (Das was in die Spitzen Klammern kommt!
         */

        Pair<String, Double> hallo = new Pair<>("Hallo", 12.33);
    }
}
 