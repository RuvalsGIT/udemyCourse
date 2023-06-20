package methods_declarations;

public class methods_declarations1 {
    public static void main(String[] args) {
        Lines.lines();
        System.out.println();
        Lines.lines();
    }
}
class Lines { // Hiermit erstellen wir eine neue Klasse methods_declarations.Lines für die Methode lines
    static void lines() { // wichtig ist hier, dass entweder public oder keine Sichtbarkeit steht. Priv. geht nicht!
    for (int i = 0; i < 10; i++) {
        printHeart();
        }
    }

static void printHeart() { // Keine Sichtbarkeit ist eine sog. Sichtbarkeit innerhalb eines Packages
    System.out.print("♥");
    }
}
