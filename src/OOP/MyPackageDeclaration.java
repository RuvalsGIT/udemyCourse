package OOP;

// Wir verwenden hierfür den Import von Paketen!
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class MyPackageDeclaration {
    public static void main(String[] args) {

        // Wir fragen die Koordinaten ab
        System.out.println("x=");
        int x = new Scanner(System.in).nextInt();
        System.out.println("y=");
        int y = new Scanner(System.in).nextInt();

        // Wir erstellen ein neues Objekt point und möchten die variablen x und y als Koordinaten initialisieren

        // Wie können wir point mit unseren Eingaben deklarieren?
        // 1. point.x = x;
        // 2. point.setLocation(x,y)
        // 3. Bei der Deklaration übergeben wir die Parameter
        // java.awt.Point point = new java.awt.Point(x,y);


        Point point = new Point(x,y);
        System.out.println(point);


        // Dieser Code ist aber umständlich zu schreiben
        // wir schreiben java.util 2x
        // wir schreiben java.awt.Point 2x

        // Wie können wir das verkürzen???



        // WICHTIG:
        // Falls es Methoden oder Typen gibt, die sich unter den Paketen überschneiden, müssen diese
        // im Code selbst wie gewohnt extra deklariert werden!
    }
}
