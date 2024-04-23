package Flyweight.main;

import Flyweight.clase.Caracteristici;
import Flyweight.clase.Fabrica;

public class Main {
    public static void main(String[] args) {
        Fabrica fabrica=new Fabrica();
        Caracteristici caracteristici1=new Caracteristici(12,14,"rosu");
        Caracteristici caracteristici2=new Caracteristici(24,14,"roz");
        Caracteristici caracteristici3=new Caracteristici(12,13,"albastru");
        Caracteristici caracteristici4=new Caracteristici(23,15,"galben");

        fabrica.getSpectator(10,10).deseneaza(caracteristici1);
        fabrica.getSpectator(20,10).deseneaza(caracteristici2);
        fabrica.getSpectator(10,10).deseneaza(caracteristici3);
        fabrica.getSpectator(20,10).deseneaza(caracteristici4);

    }
}
