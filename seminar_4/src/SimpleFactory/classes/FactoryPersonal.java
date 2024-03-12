package SimpleFactory.classes;

public class FactoryPersonal {

    public PersonalSpital createPersonal(TipPersonal tipPersonal, String nume, int salariu) throws Exception {
        switch (tipPersonal){
            case Medic:
                Medic medic = new Medic(nume, salariu);
                return medic;
            case Asistent:
                Asistent asistent = new Asistent(nume, salariu);
                return asistent;
            case Brancardier:
                Brancardier brancardier = new Brancardier(nume, salariu);
                return brancardier;
            case Infirmier:
                Infirmier infirmier = new Infirmier(nume, salariu);
                return infirmier;
            default:
                throw new Exception("Tipul nu exista !");
        }
    }
}
