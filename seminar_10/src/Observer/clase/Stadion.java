package Observer.clase;

public class Stadion extends Subiect{
    @Override
    public void notificaMeciFotbal() {
        super.notificaAbonat("Azi va avea loc un meci de fotball");
    }

    @Override
    public void notificaMeciVolei() {
        super.notificaAbonat("Azi va avea loc un meci de volei pe stadion");
    }

    @Override
    public void notificaMeciHandball() {
        super.notificaAbonat("Azi va avea loc pe stadion un meci de handabll feminin");
    }

    public void notificaConcert(){
        super.notificaAbonat("Astazi, pe stadion, vor canta mai multe formatii");
    }
}
