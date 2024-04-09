package Decorator.main;

import Decorator.decorator.AplicatieMobila;
import Decorator.decorator.Decorator;
import Decorator.decorator.Website;
import Decorator.spital.Diagnostic;
import Decorator.spital.DiagnosticAbstract;

public class Main {
    public static void main(String[] args) {

        DiagnosticAbstract diagnosticAbstract = new Diagnostic("Tuberculoza", " scadere in greutate, tuse, pierderea constientei", true);
        diagnosticAbstract.printeazaDiagnostic();

        Decorator decorator = new AplicatieMobila(diagnosticAbstract);
        decorator.afisareOnline();
        decorator.printeazaDiagnostic();

        Decorator decoratorWebsite = new Website(diagnosticAbstract);
        decoratorWebsite.afisareOnline();
    }
}
