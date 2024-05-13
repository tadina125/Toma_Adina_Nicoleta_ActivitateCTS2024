package Flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlywightFabrica {
    private Map<String,Flyweight> spectatori;

    public FlywightFabrica() {
        this.spectatori = new HashMap<>();
    }

    public Flyweight getSpectatori(int inaltime, int latime){
        String cheie = inaltime + "_" + latime;
        if(spectatori.containsKey(cheie)){
           return spectatori.get(cheie);
        } else {
            Flyweight flyweight = new Spectator(inaltime, latime);
            spectatori.put(cheie, flyweight);
            return flyweight;
        }
    }
}
