package FactoryMethod.classes;

import SimpleFactory.classes.PersonalSpital;

public interface FabricaPersonal {

    public PersonalSpital createPersonal(String nume, int salariu);
}
