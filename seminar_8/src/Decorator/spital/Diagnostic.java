package Decorator.spital;

public class Diagnostic implements DiagnosticAbstract{
    private String numeDiagnostic;
    private String simptome;
    private Boolean necesitaSpitalizare;

    public Diagnostic(String numeDiagnostic, String simptome, Boolean necesitaSpitalizare) {
        this.numeDiagnostic = numeDiagnostic;
        this.simptome = simptome;
        this.necesitaSpitalizare = necesitaSpitalizare;
    }

    @Override
    public String toString() {
        return "Diagnostic{" +
                "numeDiagnostic='" + numeDiagnostic + '\'' +
                ", simptome='" + simptome + '\'' +
                ", necesitaSpitalizare=" + necesitaSpitalizare +
                '}';
    }


    @Override
    public void printeazaDiagnostic() {
        System.out.println("Diagnostic : " + this.numeDiagnostic + ", simptome: " + this.simptome + " si " + (necesitaSpitalizare ? " necesita " : " nu necesita ") + " spitalizare. ");
    }

    @Override
    public String getNumeDiagnostic() {
        return numeDiagnostic;
    }

    @Override
    public String getSimptome() {
        return simptome;
    }

    @Override
    public Boolean getNecesitaSpitalizare() {
        return necesitaSpitalizare;
    }
}
