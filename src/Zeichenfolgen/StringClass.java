package Zeichenfolgen;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class StringClass {
    public static void main(String[] args) {

        String name = "vale"; // Wir deklarieren das Objekt name vom Typ String und initialisieren es im "vale"
        System.out.println(name.length()); // Wir wollen die Länge des Strings erfahren
        System.out.println(name.isEmpty());// Wir prüfen ob der String leer ist -> ist length == 0?
        System.out.println(name.isBlank());// Wir prüfen ob der String aus Leerzeichen besteht

        //Zeichenzugriff
        System.out.println(name.charAt(0)); // mit charAT greifen wir ein bestimmtes Zeichen zu. Beginnend bei 0!
        System.out.println(name.charAt(name.length() - 1)); // Wir wollen auf das letzte Zeichen zugreifen


        // Wir erstellen eine Methode isAllDigits die prüft, ob alle Daten eine Zahl sind
        System.out.println(isAllDigits("234")); // Mit Alt+Enter lassen wir IntelliJ eine Methode erstellen.
        System.out.println(isAllDigits("234A"));
        System.out.println(isAllDigits(""));


        // Suche nach Character im String
        System.out.println(name.indexOf("a")); // Ausgabe 1
        System.out.println(name.indexOf("X")); // Ausgabe -1 (Negativer Wert == keins vorhanden!)
        System.out.println(name.indexOf("v")); // Ausgabe 0


        // Vergleiche
        System.out.println("abc".equals("abc")); // true - alle Zeichen sind gleich
        System.out.println("abc".equals("ABC")); // false - es wird zwischen Groß und Kleinschreibung unterschieden
        System.out.println("abc.".equalsIgnoreCase("ABC")); // mit der Methode equalsIgnore Case -> True
        // -> Fazit mit equals prüfen wir ob die Strings gleichwertig sind

        // -> wir wollen ober nun prüfen, ob Strings größer oder kleiner sind
        System.out.println("abc".compareTo("xyz")); // E: -23 // abc ist kleiner als xyz <- daher negativ
        System.out.println("xyz".compareTo("abc")); // E: 23 // xyz ist größer als abx <- daher positiv
        System.out.println("abc".compareTo("abc")); // E:  0 // nicht größer nicht kleiner <- 0

        // String verbinden
        System.out.println("a" + 1); // Zur Konkatenation verwenden wir ein + Operator
        System.out.println("Hallo ".concat("Welt")); // Wir können auch die Methode concat() verwenden

        String ip = String.join(".", "128", "127", "19", "9");
        // mit der Methode join(), Verbinden wir mehrere String miteinander und Trennen diese mit einem delimiter
        System.out.println(ip); // Ausgabe: 128.127.19.9

        //Konvertierung in Groß- und Kleinschreibung

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        ;

        // Ersetzen
        System.out.println(name.replace('e', 'i'));
        System.out.println(name.replace("e", " "));
        System.out.println("abcdabcdabcde".replace("abc", "")); //Wir können auch Zeichenkettenfiltern

        // Zeichenketten wiederholen
        System.out.println("ab".repeat(5)); //Erst ab Java 11 Verfügbar

        //split(...)
        String[] split = "abc6def9abc6".split("\\d"); // "//d" steht für digit, [] steht für den Array
        // Wir splitten hier den String an jedem digit
        String[] ente = "AlleMeineEntchen".split("");

        System.out.println(Arrays.toString(split)); // [abc, def, abc]
        System.out.println(Arrays.toString(ente));

        //matches(...)
        System.out.println("3458".matches("\\d+"));
        // Wir prüfen ob "3458" eine Folge von Ziffern(digits) ist. Das "+" prüft, ob es eine Folge ist


        //Aufgabe a): Wir wollen prüfen, ob der String filename ("Cpu.tXt    ") die Zeichenkette ".txt" enthält.
        String filename = "Cpu.tXt    ";
        //Um dies prüfen zu können, müssen wir erstmal alles kleinschreiben und die Leerzeichen entfernen.
        boolean b = filename.trim().toLowerCase(Locale.ROOT).endsWith(".txt");
        // boolean b <- wir wollen prüfen, ob es stimmt, dass der String auf ".txt" endet (true?, false?)
        // trim() <- trimmt den String
        // toLowerCase() <- setzt alles auf Kleinbuchstaben
        // (Locale.Root) <- nutzt die Systemsprache (deutsch <- also mit ä,ü,ö,ß,)
        // endsWith() <- gibt an das der String mit ".txt" enden soll

        // -> Ergebnis: true

        //Aufgabe b): Wir wollen den Dateinamen ohne den Suffix ".txt"
        int indexOfDot = filename.indexOf('.'); // Wir wollen die letzte Stelle vom letzten Auftreten von '.' erfahren
        if (indexOfDot >=0){ // Wenn die Stelle größer als 0 ist, gib die Stelle von "." aus.
            System.out.println(indexOfDot); // Ausgabe: 3 (0=c, 1=p, 2=u, 3=.)
        }
        System.out.println(filename.substring(0, indexOfDot));
        // Wir nutzen die Methode substring um einen String zu sezieren und geben dabei den Start und Endwert an.
        // Der Startwert ist Inklusive und der Endwert ist Exklusive!

    }


    private static boolean isAllDigits(String string) {
        if (string.isEmpty()) { // Wenn string.Empty(== True) -> Dann return false
            return false;
        }
        for (int i = 0; i < string.length(); i++) { // Die For-Schleife soll solange laufen, wie der String lang ist
            char c = string.charAt(i); // wir initialisieren den char c -> dieser soll die jeweilige Stelle vom String haben.
            if (!Character.isDigit(c)) { // nun prüfen wir ob der character c ein Digit ist ->falls nicht -> return false
                return false;
            }
        }
        return true;// -> falls alles passt -> return true


    }
}