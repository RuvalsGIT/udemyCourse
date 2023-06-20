package methods_declarations;

public class methods_declarations3 {
    public static void main (String [] args){ // da wir hier static haben, muss unten ebenfalls static aufgerufen werden!
        System.out.println(Math.random()); // eine reine Zufallszahl wird ausgegeben 0,0-1
        System.out.println(random(100)); // 100 ist das Argument zu dem Parameter factor!
    }

    static double random(int factor) { // wichtig ist hier wieder an das static zu denken
        return Math.random() * factor; // return verspricht etwas zurückzugeben
    }
}
