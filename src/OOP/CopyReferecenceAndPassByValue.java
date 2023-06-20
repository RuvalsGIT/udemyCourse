package OOP;

public class CopyReferecenceAndPassByValue {
    public static void main(String[] args) {

        int age = 50;
        int dogAge = age;

        System.out.println(dogAge);

        // Hierbei gibt der Compiler das dogAge aus, in dem es die Referenz age (50) liest


        java.awt.Point p = new java.awt.Point();
        java.awt.Point q = p;

        // Den Inhalt der Variablen P (Referenz) kopieren wir in Q rein.
        // Das Ergebnis ist das P und Q auf das identische Objekt verweisen java.awt.Point
        // Man kan sagen, dass P und Q "Aliase" sind bzw. Synonyme
        // So mit ist es egal, ob wir über P oder Q auf das Objekt

        p.x = 10;
        System.out.println(q.x);

        q.y = 20;
        System.out.println(p.y);

        // Ergebnis: 10, 20

        printPoint(p); // Argument p soll in dieser Methode verwendet werden
        // Ergebnis: 10, 20

        swap(p);
        System.out.println(p);
        //Ergebnis: java.awt.Point[x=20, y = 10]

        clearPoint(p);
        System.out.println(p);
        // Ergebnis: java.awt.Point[x= 20, y= 10]
        // in dem Moment wo clearPoint aufgerufen wird, geben wir den Verweis auf ein Objekt.
        // Die var. P wird lokal initialisiert, daher ist die nur lokal mit dem Wert x=0, y=0;

        System.out.println(randomPoint());
        // Ergebnis random

        clearPoint2(p);
        System.out.println(p);
        // Ergebnis 0;
        // nun gibt es uns den return von p mit 0er Werten
        // p wird geleert angezeigt
    }
    static void printPoint(java.awt.Point p) {
    // static - damit es in der main-Methode aufgerufen werden kann
    // void - wir benötigen keine Rückgabe
    // printPoint - Name der Methode
    // (java.awt.Point p) - Parameter Point p -> das p in dieser Methode hat noch keine Werte, diese werden in Main vergeben!
        System.out.println(p.x);
        System.out.println(p.y);
    }
    static void swap (java.awt.Point p){
        int swap = p.x;
        p.x = p.y;
        p.y = swap;
    }
    static void clearPoint(java.awt.Point p){
        p = new java.awt.Point();
    }
    static java.awt.Point randomPoint() {
        java.awt.Point point = new java.awt.Point();
        point.setLocation(Math.random() * 10, Math.random()*20);
        return point;
    }

    static java.awt.Point clearPoint2( java.awt.Point p){
        p.x = p.y = 0;
        return p;
    }
}
