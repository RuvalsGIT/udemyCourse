package types;

public class TvApplication {
    public static void main(String[] args) {


        TV tv_a = new TV();
        tv_a.on();
        tv_a.off();

        System.out.println(tv_a.getMonitorTube());
        System.out.println(tv_a.getMonitorTube().getTv());
        System.out.println(tv_a);

        // Wir bauen ein Haus, welches mehrere Radios und TV Geräte enthält
        House house = new House();

    }
}