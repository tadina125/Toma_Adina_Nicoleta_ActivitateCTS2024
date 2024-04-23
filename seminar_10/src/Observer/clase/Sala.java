package Observer.clase;

import java.util.List;

public class Sala extends Subiect{

    @Override
    public void notificaMeciFotbal() {
        String mesaj = "In data de 23/04/2025, ora 15:00 va avea loc un meci de fotball.";
        notificaAbonat(mesaj);
    }

    @Override
    public void notificaMeciVolei() {
        String mesaj = "In data de 21/05/2023, ora 18:00 va avea loc un meci de volei.";
        notificaAbonat(mesaj);
    }

    @Override
    public void notificaMeciHandball() {
        String mesaj = "In data de 15/07/2024, ora 21:00 va avea loc un meci de handball.";
        notificaAbonat(mesaj);
    }
}
