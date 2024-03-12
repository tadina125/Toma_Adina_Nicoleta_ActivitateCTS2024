package SimpleFactory.main;

import SimpleFactory.classes.FactoryPersonal;
import SimpleFactory.classes.PersonalSpital;
import SimpleFactory.classes.TipPersonal;

public class Main {
    public static void main(String[] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();
        try{
            PersonalSpital medic = factoryPersonal.createPersonal(TipPersonal.Medic, "Marian Iurie", 7000);
            PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "Popescu Iuliana", 4000);
            PersonalSpital brancardier = factoryPersonal.createPersonal(TipPersonal.Brancardier, "Toma Andreea", 3000);
            medic.afisareDetalii();
            asistent.afisareDetalii();
            brancardier.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
