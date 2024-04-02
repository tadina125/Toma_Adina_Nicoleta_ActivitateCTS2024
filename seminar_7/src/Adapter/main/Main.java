package Adapter.main;

import Adapter.softNou.Bar;
import Adapter.softNou.Bautura;
import Adapter.softNou.SoftBar;
import Adapter.softVechi.*;


public class Main {
    public static void platesteConsumatie(SoftBucatarie bucatarie){
        bucatarie.printareBon();
    }

    public static void main(String[] args) {
        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs_1 = new Produs("Salata", 15);
        Produs produs_2 = new Produs("Penne carbonara", 35);
        bucatarie.adaugareProdus(produs_1);
        bucatarie.adaugareProdus(produs_2);

        bucatarie.printareBon();

        SoftBar bar = new Bar();
        Bautura bautura_1 = new Bautura("Cappuccino", 15);
        Bautura bautura_2 = new Bautura("Limonada", 18);
        bar.adaugareBautura(bautura_1);
        bar.adaugareBautura(bautura_2);
        bar.printareBon();

        AdapterComandaBarBucatarie bar_1 = new AdapterComandaBarBucatarie();
        bar_1.adaugareBautura(new Bautura("Cola", 10));
        bar_1.adaugareBautura(new Bautura("Mojito", 35));

        Bautura bautura = new Bautura("Apa", 5);
        AdapterBauturaProdus produs = new AdapterBauturaProdus(bautura);
        bar_1.adaugareProdus(produs);

        platesteConsumatie(bar_1);


    }
}
