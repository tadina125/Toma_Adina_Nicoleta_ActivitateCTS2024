package Observer.clase;

public class Vecini implements Observer{
    private String nume;
    private float distantaSala;

    public Vecini(String nume, float distantaSala) {
        this.nume = nume;
        this.distantaSala = distantaSala;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume + "sala aflata la o distanta de " + this.distantaSala + " km de tine, a trimis catre abonati urmatorul mesaj: " + mesaj);
    }
}
