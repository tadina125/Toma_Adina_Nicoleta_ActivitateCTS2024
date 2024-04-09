package Composite.main;

import Composite.clase.Departament;
import Composite.clase.Sectie;
import Composite.clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta spital = new Departament("Spital", "Vasilescu David");
        StructuraAbstracta cardiologie = new Departament("Cardiologie", "Petreanu Irina");
        StructuraAbstracta oftamologie = new Departament("Oftamologie", "Chitian Alexandru");

        StructuraAbstracta terapieIntensiva = new Sectie("ATI", 25, "Tudoroiu Andrei");
        StructuraAbstracta chirurgie = new Sectie("Chirurgie", 40, "Aurelian Elena");
        StructuraAbstracta optometrie = new Sectie("Optometrie", 5, "Costescu Denis");

        try{
            spital.adaugaStructura(cardiologie);
            spital.adaugaStructura(oftamologie);
            cardiologie.adaugaStructura(terapieIntensiva);
            cardiologie.adaugaStructura(chirurgie);
            oftamologie.adaugaStructura(optometrie);

            spital.afiseazaDescriere("  ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
