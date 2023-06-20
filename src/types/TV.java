package types;

import java.util.Random;

public class TV {

    private boolean isOn;
    private int volume;
    private int channel;
    //Wir erstellen ein zusätzliches Objekt vom Typ MonitorTube in unserer TV-Klasse.
    // Mit ALT+ENTER lassen wir hierzu eine Klasse erstellen
    private MonitorTube monitorTube = new MonitorTube(this);



    //Standardkonstruktor
    public TV(){ // Hier haben wir einen nicht parametrisierten Standardkonstruktor erstellt.
        isOn = true;
        volume = 20;
        channel = 1;
    }

    // Parametrisierter Konstruktor
    public TV(boolean isOn, int volume, int channel){ // Wir erstellen einen parametrisierten Konstruktor
        this.isOn = isOn;
        this.volume = volume;
        this.channel = channel;
    }

    //Copy-Konstruktor
    public TV(TV original){
        channel = original.channel;
        isOn = original.isOn;
        volume = original.volume;
    }

    public void setChannel(int channel){
        this.channel = channel;
    }
    public int getChannel(){
        return channel;
    }


    public TV(boolean isOn){
        this.isOn = isOn;
    }

    public MonitorTube getMonitorTube() {
        return monitorTube;
    }

    //Wir erstellen eine Methode in der TV Klasse, welche eine Meldung ausgibt, wenn der TV ausgeschaltet wird.
    //Diese Methode Verlinken wir ebenfalls mit der MonitorTube-Klasse
    public void on(){
        System.out.println("Ich bin ein TV, ich werde eingeschaltet");
        monitorTube.on();
    }



    //Das ganze wiederholen wir nun für die Methode off in der TV-Klasse
    public void off() {
        System.out.println("Ich bin ein TV, ich werde ausgeschaltet");
        monitorTube.off();
    }

    @Override
    public String toString() {
        return "TV{" +
                "isOn=" + isOn +
                ", volume=" + volume +
                ", channel=" + channel +
                '}';
    }
}
