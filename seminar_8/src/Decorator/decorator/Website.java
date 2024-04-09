package Decorator.decorator;

import Decorator.spital.DiagnosticAbstract;

public class Website extends Decorator{

    public Website(DiagnosticAbstract diagnostic) {
        super(diagnostic);
    }

    @Override
    public void afisareOnline() {
        System.out.println("Pe site-ul web a fost afisat diagnosticul "
                + super.getNumeDiagnostic() + ", simptome: "
                + super.getSimptome() + " si "
                + (super.getNecesitaSpitalizare() ? " necesita " : " nu necesita ") + " spitalizare. ");
    }
}
