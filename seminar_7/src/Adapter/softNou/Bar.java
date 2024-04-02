package Adapter.softNou;

import java.util.ArrayList;
import java.util.List;

public class Bar implements SoftBar{
    private List<Bautura> bauturi;

    public Bar() {
        this.bauturi = new ArrayList<>();
    }


    @Override
    public void printareBon() {
        System.out.println("Nota de plata bar: ");
        float total = 0;
        for(Bautura bautura:bauturi){
            System.out.println("Bautura: " + bautura.getDenumire() + ", pret: " + bautura.getPret());
            total = total + bautura.getPret();
        }

        System.out.println("Total de plata: " + total + " lei.\n");
    }

    @Override
    public void adaugareBautura(Bautura bautura) {
        bauturi.add(bautura);
    }
}
