package JAVALANGOBJECT;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class ComparatorAndComparable {
    public static void main(String[] args) {
    Freezer f1 = new Freezer();
    f1.capacity = 100;
    f1.watt = 100;

    Freezer f2 = new Freezer();
    f2.capacity = 100;
    f2.watt = 100;

        //Lexicographic Ordnung anhand des Unicodes
        System.out.println("abc".compareTo("cde")); // ERG: -2 (<0)
        System.out.println("abc".compareTo("123")); // ERG: 48 (>0)
        System.out.println("abc".compareTo("abc")); // ERG: 0  (=0)

        LocalTime.of(20,23).compareTo(LocalTime.of(21,23)); // <0
        LocalTime.of(22,23).compareTo(LocalTime.of(21,23)); // >0
        LocalTime.of(20,23).compareTo(LocalTime.of(20,23)); // =0

        List<LocalTime> times = new ArrayList<>();
        times.add(LocalTime.now());

    }
}

class Freezer{
    double watt;
    int capacity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Freezer freezer = (Freezer) o;

        if (Double.compare(freezer.watt, watt) != 0) return false;
        return capacity == freezer.capacity;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(watt);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + capacity;
        return result;
    }
}