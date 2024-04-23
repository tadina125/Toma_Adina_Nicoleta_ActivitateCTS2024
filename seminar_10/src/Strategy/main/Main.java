package Strategy.main;

import Strategy.clase.*;

public class Main {
    public static void main(String[] args) {

        Portar portar = new Portar();
        String suporter_1 = "Marian VIP";
        String suporter_2 = "Alexandru Tribuna";
        String suporter_3 = "Andrei Peluza";

        portar.setStrategie(new VerificatorVIP());
        portar.verificaSuporter(suporter_1);

        portar.setStrategie(new VerificatorTribuna());
        portar.verificaSuporter(suporter_2);

        portar.setStrategie(new VerificatorPeluza());
        portar.verificaSuporter(suporter_3);
    }
}
