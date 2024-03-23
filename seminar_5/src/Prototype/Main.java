package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii_1 = new HashMap<>();
        solutii_1.put("benzoat", 20.34);
        solutii_1.put("bufren", 32.91);
        Reteta prototipReteta = new Reteta(solutii_1, "Medicament_1");

        RetetaAbastracta retetaAbastracta_1 = prototipReteta.clone();
        System.out.println(retetaAbastracta_1);

        RetetaCrema prototipCrema = new RetetaCrema(23, "Galbenele");
        RetetaAbastracta retetaAbastracta_2 = prototipCrema.clone();
        System.out.println(prototipCrema);
    }
}
