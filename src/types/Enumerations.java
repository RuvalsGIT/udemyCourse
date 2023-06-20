package types;

public class Enumerations {

    public static final String EIGHT_POINTED_PINWHEEL_STAR = "\u2735";
    private static final int WIDTH = 1024; // Wir erstellen eine neue Konstante WIDTH mit dem Wert 1024

    public static void main(String[] args) {
        System.out.println(EIGHT_POINTED_PINWHEEL_STAR); // Daher erstellen wir mit CTRL+ALT+C eine Konstante
        // Ausgabe: ✵
        setWidth(36538); // Wir haben unten eine neue Setter Methoder erstellt. Ob sich nun der Wert verändern lässt?
        System.out.println(WIDTH); // Ausgabe: 1024 -> Nein es bleibt beim alten Wert!

    }
    private static void setWidth(int width){
    }
}
