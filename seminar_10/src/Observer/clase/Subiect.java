package Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> observatori;

    public Subiect() {
        this.observatori = new ArrayList<>();
    }

    public void adaugareAbonat(Observer observer){
        observatori.add(observer);
    }

    public void stergereAbonat(Observer observer){
        observatori.remove(observer);
    }

    public void notificaAbonat(String mesaj){

        for (Observer observator:observatori) {
            observator.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciVolei();
    public abstract void notificaMeciHandball();
}
