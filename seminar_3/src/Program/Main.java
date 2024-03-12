package Program;

import classesDataBase.ConexiuneBazaDeDate;

public class Main {
    public static void main(String[] args) {

        ConexiuneBazaDeDate primaConexiune = ConexiuneBazaDeDate.getInstanta("DDS_package_19.0.4", "1awdh3", 230);
        ConexiuneBazaDeDate aDouaConexiune = ConexiuneBazaDeDate.getInstanta("OUT_package_18.0.14", "1dhfhjdj", 150);

        System.out.println("Nume: " + primaConexiune.getNumeBaza() + " conexiune: " + primaConexiune.getLinkConexiune() + " numar tabele: " + primaConexiune.getNrTabele());
        System.out.println(aDouaConexiune);
    }
}
