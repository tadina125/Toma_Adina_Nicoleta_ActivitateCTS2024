package Decorator.decorator;

import Decorator.spital.DiagnosticAbstract;

public class AplicatieMobila extends Decorator{

    public AplicatieMobila(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("In cadrul aplicatiei mobile ati primit diagnosticul "
                + super.getNumeDiagnostic() + ", simptome: "
                + super.getSimptome() + " si "
                + (super.getNecesitaSpitalizare() ? " necesita " : " nu necesita ") + " spitalizare. ");
    }
}
