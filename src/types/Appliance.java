package types;

public class Appliance {
    protected boolean isOn; // Wir haben die variable isOn aus Radio genommen und in die Oberklasse getan
    //-> Wichtig! Um weiter die Funktionen aus Radio nutzen zu können haben wir den Modifier auf protected gesetzt

    //Mit protected gibt es jedoch eine gewisse Paketsichtbarkeit, welche wir vermeiden wollen.
    //-Deshalb stellen wir es wieder auf private und setzen Getter und Setter ein.

    //Getter/Setter isOn
    public boolean isOn(){ // Bei dem Typ Boolean verwendet man statt dem get -> is
        return isOn;
    }
    public void setOn(boolean isOn){
        this.isOn = isOn;
    }

    // Wir fügen der Klasse Appliance den Konstruktor Appliance hinzu:
    // Gleichzeitig soll, wenn der Konstruktor aufgerufen wird, boolean isOn auf true gesetzt werden.
    Appliance(){
        System.out.println("Appliance");
        isOn = true;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "isOn=" + isOn +
                '}';
    }
}
