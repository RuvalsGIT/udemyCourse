package Exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class Exceptions {
    public static void main(String[] args){
        /*
        //ungeprüfte Ausnahmen: Unchecked Exceptions, bzw. RunTimeExceptions
        //geprüfte Ausnahmen:   Checked Exceptions

        Path path = Paths.get("dateiname.txt");
        List<String> list = new ArrayList<>();

        // Damit wir ein Programm was möglicherweise eine Exception auslöst ausführen bzw. darauf reagieren können
        // verwenden wir den Try block:

        try {
            Files.write(path, list);
            System.out.println("Fertig!");
        }

        //Der catch-Block wird verwendet, um die Ausnahme zu behandeln, die im try-Block aufgetreten ist.
        // Hier wird der Code geschrieben, der ausgeführt wird, wenn eine Ausnahme auftritt.

        catch(IOException e){ // e ist einen variablen Namen vom Typ IOException
            System.err.println("Fehler!");
        }

         */

        Path path = Paths.get("numbers.txt");
        try {
            List <String> lines = Files.readAllLines(path);
            for(String line : lines){
                int number = 0;
                try {
                    number = Integer.parseInt(line);
                } catch (NumberFormatException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Integer.toBinaryString(number));
            }
        }
        catch(IOException e){
            System.err.println("Error");
        }
    }
}
