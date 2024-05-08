package Template.clase;

public abstract class Template {

    public final void internare(Pacient pacient){
        analizaStareSanatated(pacient);
        if(disponibilitatePaturi() > 0){
            emitereFisa(pacient);
        } else {
            refuzInternare(pacient);
        }
    }

    protected abstract void analizaStareSanatated(Pacient pacient);
    protected abstract int disponibilitatePaturi();
    protected abstract void emitereFisa(Pacient pacient);
    protected abstract void refuzInternare(Pacient pacient);
}
