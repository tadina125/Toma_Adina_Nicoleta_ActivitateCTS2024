package Composite.clase;

public abstract class StructuraAbstracta {
    private String nume;

    public StructuraAbstracta(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void adaugaStructura(StructuraAbstracta structuraAbstracta);
    public abstract void stergeStructura(StructuraAbstracta structuraAbstracta);
    public abstract StructuraAbstracta getStructura(int index);

    public abstract void afiseazaDescriere(String indentare);
}
