package Adapter.softVechi;

import Adapter.softNou.Bar;
import Adapter.softNou.Bautura;

public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie{
    @Override
    public void printareBon() {
        super.printareBon();
    }

    @Override
    public void adaugareProdus(Produs produs) {
        Bautura bautura = new Bautura(produs.getDenumire(), produs.getPret());
        super.adaugareBautura(bautura);
    }

}
