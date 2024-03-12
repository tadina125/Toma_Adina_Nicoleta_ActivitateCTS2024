package FactoryMethod.classes.main;

import FactoryMethod.classes.FabricaAsistent;
import FactoryMethod.classes.FabricaMedic;
import FactoryMethod.classes.FabricaPersonal;
import SimpleFactory.classes.PersonalSpital;

public class Main {

    public static void prelucrarePersonal(FabricaPersonal fabricaPersonal, String nume, int salariu) {
        PersonalSpital personal = fabricaPersonal.createPersonal(nume, salariu);
        personal.afisareDetalii();
    }



    public static void main(String[] args) {
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaAsistent = new FabricaAsistent();

        PersonalSpital medic = fabricaMedic.createPersonal("Marius Ilie", 6700);
        PersonalSpital asistent = fabricaAsistent.createPersonal("Potcovescu Ioana", 3500);

         medic.afisareDetalii();
         asistent.afisareDetalii();

         prelucrarePersonal(new FabricaMedic(), "Burlacu Petru", 7600);
    }
}
