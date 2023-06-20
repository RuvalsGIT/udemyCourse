package methods_declarations;

public class methods_declarations2 {
    public static void main (String [] args) {
    lines(10, '#'); // Wir übergeben der Methode lines das ARGUMENT 10.
    } // Es müssen auch so viele Argumente übergeben wie es Parameter gibt!

    // Wir wollen ausschließen, dass c ein Leerzeichen oder Tab ist.



    static void lines(int len, char c) { // Wir übergeben zwei PARAMETER bei der DEKLARATION der Methode

        switch ( c ) {
            case ' ':
            case '\t':
                return;
        }


        for (int i = 0; i < len; i++){
            printChar('*');
        }
    }

    static void printChar(char c) {
        System.out.print(c);
    }
}
