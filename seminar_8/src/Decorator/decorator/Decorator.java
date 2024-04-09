package Decorator.decorator;

import Decorator.spital.DiagnosticAbstract;

public abstract class Decorator implements DiagnosticAbstract {
    private DiagnosticAbstract diagnostic;

    public Decorator(DiagnosticAbstract diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public void printeazaDiagnostic(){
        diagnostic.printeazaDiagnostic();
        System.out.println("Rezultatul este disponibil si pe platforma");
    }

    @Override
    public String getNumeDiagnostic() {
        return diagnostic.getNumeDiagnostic();
    }

    @Override
    public String getSimptome() {
        return diagnostic.getSimptome();
    }

    @Override
    public Boolean getNecesitaSpitalizare() {
        return diagnostic.getNecesitaSpitalizare();
    }

    public abstract void afisareOnline();
}
