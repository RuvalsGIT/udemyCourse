package types;

import java.util.Locale;

public class Radio extends Appliance{
    // Eine Klasse ist ein Model -> Eine Modellierung eines Radios <- UsedCase
    // Welche Attribute hat ein Radio?
    private String name = "";
    private double frequency; // Welche Frequenz hat das Radio
    private int volume; // Wie laut ist das Radio

    //Konstruktor

    //Wir wollen, dass Objekte, die aus der Klasse Radio erzeugt werden, immer diese Attribute initialisiert hat.
    public Radio(String name, boolean isOn, double frequency, int volume){
        this.name = name;
        this.isOn = isOn;
        this.frequency = frequency;
        this.volume = volume;
    }

    static double senderNameToFrequency(String name){
        switch (name.toLowerCase(Locale.ROOT)){
            case "java" : return 101.0;
            case "bestofjava" : return 87;
            default: return 0;
        }
    }

    //Warum setzen wir die Attribute auf private?
    //Wir wollen, dass die Radios nur die Funktion volumeUp und volumeDown, Setter und Getter haben
    //in der Radio-Klasse initialisieren, wird den Wert auf 0. (Logisch, beim Öffnen eines Radios kann es nur lauter oder leiser sein!)
    //-> Wir benötigen daher eine Methode, die das Auslesen // Schreiben dieser Angaben ermöglicht!


    //Getter/Setter name
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Getter / Setter frequency
    public double getFrequency(){ // Ein getter ist vom double, int, String,float,char usw. weil er etwas zurückgibt!
        return frequency;
    }
    public void setFrequency(double frequency){ // ein Setter ist immer mit dem Typ void, weil er gibt nichts zurück!
        this.frequency = frequency;
    }

    //Getter/Setter volume

   public int getVolume() { // Diese Methode lässt das Attribut Volume von Außen erfragen. //<-Getter <-Lesende Methode
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }




    public void volumeUp() { // Diese Methode lässt das Attribut Volume von Außen verändern
        if (volume <= 100) {
            volume++;
        }
    }

        public void volumeDown() {
            if (volume >= 0) {
                volume--;
            }
        }

    public String toString() {
        return "Radio{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", frequency=" + frequency +
                ", volume=" + volume +
                '}';
    }
}
