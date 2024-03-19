package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbastracta{
    private Map<String, Double> solutii;
    private String numeMedicament;

    public Reteta(Map<String, Double> solutii, String numeMedicament) {
        this.solutii = solutii;
        this.numeMedicament = numeMedicament;
    }

    public Reteta(){
        solutii = null;
        numeMedicament = "Nan";
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = new HashMap<>();
        this.solutii=solutii;
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    @Override
    public RetetaAbastracta clone() {
        Reteta reteta = new Reteta();
        reteta.setSolutii(this.solutii);
        reteta.setNumeMedicament(this.numeMedicament);
        return reteta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", numeMedicament='" + numeMedicament + '\'' +
                '}';
    }
}
