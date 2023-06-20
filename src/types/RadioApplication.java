package types;

public class RadioApplication {
    public static void main(String[] args) {
        // 1. Wir erstellen ein neues Radio Objekt R1, mit der Lautstärke 50, Frequenz 105.2, welches an ist und Teufel heißt.

        Radio r1= new Radio("Teufel", true,105.2, 50);
        Radio r2= new Radio("Bose", false,100.2,10);
        // 2. Nun wollen wir uns die Informationen ausgeben lassen:

        System.out.println(r1);
        // Ausgabe: Radio{name='Teufel', isOn=true, frequency=105.2, volume=50}

        // 3. Uns ist die Musik zu laut, also wollen wir durch die Methode volumeDown die Musik leiser machen bis sie auf 30 ist.

        do {
            r1.volumeDown();
        }
        while (r1.getVolume() != 30);

        System.out.println(r1.getVolume());

        // 4. Ein geiler Track kommt und wir stellen die Musik manuel mit einer set Methode auf 100.

        r1.setVolume(100);
        System.out.println(r1.getVolume());

        // 5. Radiosender taught iwie nicht stell auf 97.5 RadioSunshine
        r1.setFrequency(97.5);
        System.out.println(r1.getFrequency());

        // 6. ok cool, klappt ja alles ganz gut. Jetzt gebe das ganze noch als toString() aus!
        System.out.println(r1.toString());

        House house = new House();
        house.add(r1);
        house.add(r2);
        System.out.println(house);

        System.out.println(house.geraeteAn());



        r1.setOn(true);
        FireAlarm fA1 = new FireAlarm();
        fA1.setOn(true);


    }
}
