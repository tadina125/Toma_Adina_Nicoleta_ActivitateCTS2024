package Flyweight.clase;

public class Caracteristici {
    private int pozX;
    private int pozY;
    private String culoare;

    public Caracteristici(int pozX, int pozY, String culoare) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.culoare = culoare;
    }

    public int getPozX() {
        return pozX;
    }

    public int getPozY() {
        return pozY;
    }

    public String getCuloare() {
        return culoare;
    }

    @Override
    public String toString() {
        return "Caracteristici{" +
                "pozX=" + pozX +
                ", pozY=" + pozY +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
