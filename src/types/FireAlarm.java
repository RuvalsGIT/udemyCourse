package types;

public class FireAlarm extends Appliance {

//Wir fügen nun FireAlarm ebenfalls einen Konstruktor ein.
// Zu beachten ist, dass FireAlarm von Appliances erbt!
FireAlarm(){
    System.out.println("FireAlarm");
    System.out.println(isOn());
}
}

