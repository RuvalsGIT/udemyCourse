package Zeichenfolgen;

public class CharCharacterStringbuilder {
    public static void main(String[] args) {

        char c = '+'; //primitiver und eingebauter Datentyp
        System.out.println(c + 1); //Ausgabe 44 <- da char ein numerischer Datentyp ist
        // Compiler ändert es bei + in eine int Wert um. für das '+' wir der Unicode 43 verwendet

        System.out.println((char)(c + 1)); // Ausgabe ","
        // Wir haben das c+1 als char gecastet somit gibt es den Unicode 44 also Komma aus

        char a = 65; // 2 Byte (Char können auch mit numerischen Werten initialisiert werden) Unicode!
        System.out.println(a); // Ausgabe "A"

        // Wir bauen ein Programm, welches von A-Z durchzählt

        for (char ch = 'A'; ch <= 'Z'; ch++){
            System.out.println(ch);
        }

        //String
        String name = "Vale"; // Alles was in "" Zeichen steht, ist automatisch ein Objekt -> String
        System.out.println(name.length());
        System.out.println(name.charAt(1));


        // StringBuilder
        StringBuilder sb = new StringBuilder(); // Wir bauen ein neuen Stringbuilder
        sb.append("Hallo"); // Bestandteil von sb ist "Hallo"
        sb.append(" Welt"); // Bestandteil von sb ist " Welt"
        System.out.println(sb); // Ausgabe Hallo Welt
        sb.reverse(); // Wir drehen den String um
        System.out.println(sb); // Ausgabe tleW ollaH

    }
}
