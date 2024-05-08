package Template.main;

import Template.clase.Pacient;
import Template.clase.SpitalPublic;

public class Main {
    public static void main(String[] args) {

        SpitalPublic spitalPublic_1 = new SpitalPublic("Sfantul Andrei", 2);
        Pacient pacient_1 = new Pacient("Gheorghe Elena");
        Pacient pacient_2 = new Pacient("Anghelescu Damian");
        Pacient pacient_3 = new Pacient("Piroslav Andreea");

        spitalPublic_1.internare(pacient_1);
        spitalPublic_1.internare(pacient_2);
        spitalPublic_1.internare(pacient_3);
    }
}
