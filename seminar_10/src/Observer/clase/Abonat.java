package Observer.clase;

public class Abonat implements Observer{
    private String nume;

    public Abonat(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(this.nume + " ai primit un mesaj: " + mesaj);
    }
}
