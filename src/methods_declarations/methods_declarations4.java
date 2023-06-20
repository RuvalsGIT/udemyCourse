package methods_declarations;

public class methods_declarations4 {
    public static void main (String [] args){
        System.out.println(random());
        System.out.println(random(10));
        System.out.println(random( 100, 200));

        lines(10);
        lines(10, '#');

    }

    static double random() { // Wir erstellen die Methode random()
        return Math.random(); //Wir wollen hier eine Rückgabe von Math.random <- RETURN
    }

    static double random(double max) {  // Wir erstellen die Methode random(mit einem Parameter)
        return Math.random() * max; //Wir wollen hier eine Rückgabe von Math.random <- RETURN
    }

    static double random(double min, double max) { // wir erstellen Methode random(mit zwei Parameter)
        return min + (Math.random() * (max-min)) ; //Wir wollen hier eine Rückgabe von Math.random <- RETURN
        }

    static void lines (int len) {
        lines(len, '-');
        }


    static void lines (int len, char c) {
        for (int i = 0; i < len; i++) {
            System.out.println(c);
        }
    }

    // Durch die verschiedene Parameterangaben können wir 3x mal dei Methode random deklarieren!
}

