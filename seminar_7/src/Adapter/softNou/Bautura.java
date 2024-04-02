package Adapter.softNou;

public class Bautura{
    private String denumire;
    private float pret;

    public Bautura(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Bautura{" +
                "denumire='" + denumire + '\'' +
                ", pret=" + pret +
                '}';
    }
}
