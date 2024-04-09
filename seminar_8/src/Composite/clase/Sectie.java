package Composite.clase;

public class Sectie extends StructuraAbstracta{
    private int nrAngajati;
    private String sefSectie;

    public Sectie(String nume, int nrAngajati, String sefSectie) {
        super(nume);
        this.nrAngajati = nrAngajati;
        this.sefSectie = sefSectie;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta structuraAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta structuraAbstracta) {
        throw new UnsupportedOperationException();
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afiseazaDescriere(String indentare) {
        System.out.println(indentare + "Sectia " + super.getNume()
                + " si este condusa de " + this.sefSectie
                + " avand un numar de " + this.nrAngajati + " angajati.");
    }
}
