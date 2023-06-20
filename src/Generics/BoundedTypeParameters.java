package Generics;

public class BoundedTypeParameters {
    // Wir bauen eine Methode, die uns zufällig einer der beiden Wert wiedergibt.
    // Mit dem <T> erstellen wir eine generische Methode mit dem Rückgabetyp T.
    // Es ist somit egal, ob es ein Integer oder String oder Double Wert ist den wir eingeben.
    /*static <T> T random(T m, T n){
        return Math.random() > 0.5 ? m : n;
    }
    */
    static <T extends CharSequence> int random(T m, T n){
        return Math.random() > 0.5 ? m.length() : n.length();
    }

    public static void main(String[] args) {
        System.out.println(random("Hallo", "12.2"));
    }
}
