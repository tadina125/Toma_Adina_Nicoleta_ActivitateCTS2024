package SimpleFactory.classes;

public class Infirmier extends PersonalSpital{

    public Infirmier(String nume, int salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetalii() {
        System.out.println("Infirmierul " + getNume() + " are un salariu de " + getSalariu());
    }


}
