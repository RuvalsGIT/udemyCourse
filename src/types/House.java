package types;

import java.util.ArrayList;

public class House {
    private ArrayList<Radio> elektrogeraete = new ArrayList<>();

    void add(Radio radio){
        System.out.printf("Radio %s wird hinzugefügt%n", radio);
        elektrogeraete.add(radio);
    }

    int geraeteAn(){
        int result = 0;
        for( Radio geraete : elektrogeraete){
            if (geraete.isOn())
                result++;
        }
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "elektrogeraete=" + elektrogeraete +
                '}';
    }
}
