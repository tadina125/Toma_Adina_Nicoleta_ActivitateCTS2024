package Proxy.clase;

public class Persoana {
    private String nume;
    private int varsta;
    private String gen;

    public Persoana(String nume, int varsta, String gen) {
        this.nume = nume;
        this.varsta = varsta;
        this.gen = gen;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getGen() {
        return gen;
    }
}
