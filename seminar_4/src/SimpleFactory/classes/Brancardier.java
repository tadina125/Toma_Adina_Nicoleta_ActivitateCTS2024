package SimpleFactory.classes;

public class Brancardier extends PersonalSpital{


    public Brancardier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Brancardierul " + getNume() + " are un salariu de: " + getSalariu());
    }
}
