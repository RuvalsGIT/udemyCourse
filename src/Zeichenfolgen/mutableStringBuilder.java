package Zeichenfolgen;

public class mutableStringBuilder {
    public static void main(String[] args) {
        //FLUENT API -> Kaskadieren -> mit . trennen!

        StringBuilder sb = new StringBuilder()
                .append("Hallo Welt ")
                .append(23)
                .append('.');
        System.out.println(sb); // Ausgabe: Hallo Welt 23.
        //Das StringBuilder Objekte lassen sich aber weiter erweitern!
        System.out.println(sb.append(" Zusatz ").append("Text")); // Ausgabe: Hallo Welt 23. Zusatz Text
        // mit der Anschließenden Methode toString(), wechseln wir den Typen auf String statt StringBuilder
        // -> lässt sich im Nachhinein nicht mehr Modifizieren!

        //Kapazität
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length()); // 0 Zeichen
        System.out.println(sb2.capacity()); // 16 Kapazität
        sb2.append("Hallo");
        System.out.println(sb2.length()); // 5 Zeichen
        System.out.println(sb2.capacity());// 16 Kapazität
        sb2.append(" Welt 1 2 3 Hallo Welt 1 2 3");
        System.out.println(sb2.length()); // 33 Zeichen
        System.out.println(sb2.capacity()); // 34 Kapazität

        // StringBuilder ist eine dynamische Datenstruktur. -> Wächst Dynamisch
        StringBuilder sb3 = new StringBuilder(20);
        sb3.append(1);
        System.out.println(sb3.length());// 1 Zeichen
        System.out.println(sb3.capacity()); // 20 Kapazität
        // Wir haben somit die Kapazität im StringBuilder die Kapazität vorgegeben
        sb3.append("12345678910112131415");
        System.out.println(sb3.length()); // 21
        System.out.println(sb3.capacity()); // 42
        // Der StringBuilder ist ein Array an Zeichen 20 St.
        // Wir haben die Zeichen auf 21 Stück erhöht.
        // Der Compiler überschreibt nun diesen Array mit einem neuen Array.
        // Um sich diesen Weg zu sparen, verdoppelt der Compiler die Kapazität des StringBuilder-Arrays auf das doppelte,
        // um bei der nächsten StringBuilder Erweiterung sich etwas zu sparen.

        // Nun haben wir aber viel zu viel Speicher benutzt, was uns unter Umständen für andere Programme fehlen könnte
        // -> Wir kürzen daher nun die Kapazität mit der Funktion trimToSize()!

        sb3.trimToSize();
        System.out.println(sb3.length()); // 21 Zeichen
        System.out.println(sb3.capacity()); // 21 Kapazität


    }
}
