package FactoryMethod.classes;

import SimpleFactory.classes.Medic;
import SimpleFactory.classes.PersonalSpital;

public class FabricaMedic implements FabricaPersonal{
    @Override
    public PersonalSpital createPersonal(String nume, int salariu) {
        return new Medic(nume, salariu);
    }
}
