package Template.clase;

public class SpitalPublic extends Template{
    private String denumireSpital;
    private int numarPaturiLibere;

    public SpitalPublic(String denumireSpital, int numarPaturiLibere) {
        this.denumireSpital = denumireSpital;
        this.numarPaturiLibere = numarPaturiLibere;
    }

    @Override
    protected void analizaStareSanatated(Pacient pacient) {
        pacient.setStareSanatate((pacient.getNume().length()%5) +1);
        System.out.println("Pacientul " + pacient.getNume() + " are starea " + pacient.getStareSanatate());
    }

    @Override
    protected int disponibilitatePaturi() {
        return numarPaturiLibere;
    }

    @Override
    protected void emitereFisa(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este internat in spitalul " + denumireSpital);
        numarPaturiLibere -= 1;
    }

    @Override
    protected void refuzInternare(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este trimis catre alt spital, deoarece spitalul " + denumireSpital + " nu are paturi disponibile.");
    }
}
