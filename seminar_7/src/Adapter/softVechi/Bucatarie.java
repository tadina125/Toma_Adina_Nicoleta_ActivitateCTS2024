package Adapter.softVechi;

import java.util.ArrayList;
import java.util.List;

public class Bucatarie implements SoftBucatarie{
    private List<Produs> listaProduse;

    public Bucatarie() {
        this.listaProduse = new ArrayList<>();;
    }

    public List<Produs> getListaProduse() {
        return listaProduse;
    }

    public void setListaProduse(List<Produs> listaProduse) {
        this.listaProduse = listaProduse;
    }

    @Override
    public String toString() {
        return "Bucatarie{" +
                "listaProduse=" + listaProduse +
                '}';
    }

    @Override
    public void printareBon() {
        System.out.println("Nota de plata bucatarie: ");

        float suma = 0;
        for (Produs produs:listaProduse) {
            System.out.println("Produs: " + produs.getDenumire() + " pret: " + produs.getPret());
            suma = suma +  produs.getPret();
        }
        System.out.println("Total de plata: " + suma + "\n");


    }

    public void adaugareProdus(Produs produs){
        listaProduse.add(produs);
    }
}
