package types;

public class MonitorTube {

    public final TV tv;
    public MonitorTube(TV tv) {
        this.tv = tv;
    }

    //Wir pflegen nun ebenfalls die Methode in die Klasse MonitorTube ein
    public void on() {
        System.out.println("Ich bin eine Bildröhre, ich werde eingeschaltet");
    }
    // Das ganze wiederholen wir nun für die Methode off() in der MonitorTube-Klasse
    public void off() {
        System.out.println("Ich bin eine Bildröhre, ich werde ausgeschaltet");
    }

    public TV getTv() {
        return tv;
    }
}
