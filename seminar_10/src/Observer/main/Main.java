package Observer.main;

import Observer.clase.*;

public class Main {
    public static void main(String[] args) {
        Observer abonat_1 = new Abonat("Alexandru Tataroiu ");
        Observer abonat_2 = new Abonat("Andrei Iliescu ");
        Observer abonat_3 = new Abonat("Elena Popescu ");
        Observer vecin_1 = new Vecini("Nicolae Apostu ", 3.5f);

        Subiect sala = new Sala();
        sala.adaugareAbonat(abonat_1);
        sala.adaugareAbonat(abonat_2);
        sala.adaugareAbonat(abonat_3);

        sala.notificaMeciFotbal();

        sala.stergereAbonat(abonat_1);
        sala.adaugareAbonat(vecin_1);

        sala.notificaMeciVolei();

        Subiect stadion = new Stadion();
        stadion.adaugareAbonat(abonat_1);
        stadion.adaugareAbonat(abonat_2);

        ((Stadion)stadion).notificaConcert();
    }
}
