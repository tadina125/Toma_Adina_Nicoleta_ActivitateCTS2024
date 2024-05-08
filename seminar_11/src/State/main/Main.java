package State.main;

import State.clase.Pacient;
import State.clase.Stare;
import State.clase.SubObservatie;

public class Main {

    public static void main(String[] args) {
        Pacient pacient_1 = new Pacient("Plesu Alexandru");
        pacient_1.setAgravareStare();
        pacient_1.vindecare();
        pacient_1.setImbunatatireStare();
        pacient_1.vindecare();

        Pacient pacient_2 = new Pacient("Iliescu Andrei");
        pacient_2.setAgravareStare();
        pacient_2.setImbunatatireStare();
        pacient_2.vindecare();
    }

}
