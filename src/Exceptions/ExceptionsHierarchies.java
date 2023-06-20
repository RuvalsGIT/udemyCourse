package Exceptions;

import javax.print.DocFlavor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExceptionsHierarchies {

    /* Vererbung Hierarchie von Exceptions.
    Throwable -> Exception -> RuntimeException
     */


    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Path.of("dateiName.txt"));
            for(String line : lines){
                System.out.println(Integer.toBinaryString(Integer.parseInt(line)));
            }
        } catch (Throwable e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
            System.out.println(e.getClass());
            System.out.println(e.toString());



        }
        // Wir schreiben ein Programm, welches aus einer Eingabe ein Double erkennt.
        while (true) { // Dauerschleife, bis eine richtige Eingabe kommt, und es in Zeile 41. gebreakt wird!
            String line = null;

            try { // Einen Try-Block um etwas zu probieren
                line = new Scanner(System.in).nextLine();   // Wir lesen den String bzw. eine Line ein
                double v = new Scanner(line).nextDouble();  // Wir wandeln diesen String in ein Double um !! E wird hier ausgelöst!!
                System.out.println(v);
                break; // Break der Schleife!
            } catch (Exception e) { // Egal welche Exception kommt - es wird ausgegeben, dass es kein gültiger Double ist!
                System.err.println(line + " ist keine gültige Fließkommazahl");
            }
        }
        System.out.println("Nach der Eingabe");
    }
}
