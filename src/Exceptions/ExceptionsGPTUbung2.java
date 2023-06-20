package Exceptions;

import java.util.ArrayList;
import java.util.List;

public class ExceptionsGPTUbung2 {
    /*Aufgabe:
    Schreibe eine Methode in Java, die eine Zahlenliste als Parameter akzeptiert und das arithmetische Mittel dieser Zahlen berechnet.
    Die Methode soll sicherstellen, dass die übergebene Liste nicht leer ist.
    Wenn die Liste leer ist, soll eine IllegalArgumentException geworfen werden.
    Unabhängig davon, ob eine Exception auftritt oder nicht, soll die Methode immer eine Abschlussnachricht ausgeben.

    Schreibe den Code für die Methode und teste sie mit verschiedenen Zahlenlisten, einschließlich einer leeren Liste.
    */

    public static int arithmetic(List<Integer> numbers){
        if(numbers.isEmpty()){
            throw new IllegalArgumentException("Die Liste ist leer!");
        }
        int result = 0;

        for(int number : numbers){
            result = result + number;
        }

        return result / numbers.size();
    }

    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();

        numbers.add((int)(Math.random()*10));
        numbers.add((int)(Math.random()*10));
        numbers.add((int)(Math.random()*10));
        numbers.add((int)(Math.random()*10));

        try{
            double arithmetic = arithmetic(numbers);
            System.out.println(arithmetic);
        }
        catch(IllegalArgumentException e){
            System.err.println("Die Liste darf nicht leer sein!");
        }
        finally{
            System.out.println("Das Programm ist beendet!");
        }
    }
}
