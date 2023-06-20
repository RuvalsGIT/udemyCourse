package Exceptions;

public class ExceptionsGPTUbung {
    /* Aufgabe:
Schreibe ein Java-Programm, das eine Methode enthält, um die Division zweier Zahlen durchzuführen.
Die Methode soll zwei Ganzzahlen als Parameter akzeptieren und das Ergebnis der Division zurückgeben.
Allerdings soll die Methode Exceptions abfangen und folgende Fälle behandeln:

Wenn der Divisor 0 ist, soll eine ArithmeticException geworfen werden.
Wenn der Dividend oder der Divisor negative Zahlen sind, soll eine IllegalArgumentException geworfen werden.
Schreibe den Code für die Methode und einen Testfall, um sicherzustellen, dass die Exceptions korrekt abgefangen werden.
     */
    public static double divi_method(int dividend,int divisor){
        if(dividend < 0 || divisor < 0){  // Hier geben wir an das eine neue Exception geworfen wird!
            throw new IllegalArgumentException("Dividend und Divisor müssen größer als 0 sein!");
        }

        if(divisor == 0){
            throw new ArithmeticException("Divisor darf nicht 0 sein!"); // Hierbei wird ebenfalls eine Exception geworfen
        }

        double result = dividend / (double)divisor;
        return result;
    }

    public static void main(String[] args) {
        int dividend = -1;
        int divisor = 2;
        try {                                                   // Mit Try machen wir eine "sichere Umgebung"
            System.out.println(divi_method(dividend, divisor));
        } catch (ArithmeticException e) {                       // Mit dem Catch verhindern wir den Programm abbruch:
            System.err.println("Divisor darf nicht 0 sein!");
        }
        catch (IllegalArgumentException e){                     // Mit dem Catch verhindern wir den Programm abbruch:
            System.err.println("Dividend und Divisor müssen größer als 0 sein!");
        }
    }
}
