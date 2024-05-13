package Flyweight.main;

import Flyweight.clase.Caracteristici;
import Flyweight.clase.FlywightFabrica;

public class Main {
    public static void main(String[] args) {
        FlywightFabrica fabrica=new FlywightFabrica();
        Caracteristici caracteristici1=new Caracteristici(12,14,"rosu");
        Caracteristici caracteristici2=new Caracteristici(24,14,"roz");
        Caracteristici caracteristici3=new Caracteristici(12,13,"albastru");
        Caracteristici caracteristici4=new Caracteristici(23,15,"galben");

        fabrica.getSpectatori(10,10).deseneaza(caracteristici1);
        fabrica.getSpectatori(20,10).deseneaza(caracteristici2);
        fabrica.getSpectatori(10,10).deseneaza(caracteristici3);
        fabrica.getSpectatori(20,10).deseneaza(caracteristici4);

    }
}
