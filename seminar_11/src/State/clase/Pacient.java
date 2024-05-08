package State.clase;

public class Pacient {
    private String nume;
    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        this.stare = new Internat();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    protected Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public void setAgravareStare(){
        if(this.stare instanceof  Internat){
            Stare subObservatie = new SubObservatie();
            subObservatie.setStare(this);
            System.out.println("Starea de sanatate a pacientului " + this.nume + " s-a agravat");
        } else {
            System.out.println("Pacientul " + this.nume+ " nu este internat");
        }
    }

    public void setImbunatatireStare(){
        if(this.stare instanceof SubObservatie){
            Stare internar = new Internat();
            internar.setStare(this);
            System.out.println("Starea de sanatate a pacientului " + this.nume + " s-a imbunatatit");
        } else {
            System.out.println("Pacientul nu era in stare grava !");
        }
    }

    public void vindecare(){
        if(this.stare instanceof Internat){
            Stare externet = new Externat();
            externet.setStare(this);
            System.out.println("Pacientul " + this.nume + " a fost externat");
        } else {
            System.out.println("Pacientul " + this.nume + " nu poate fi externat");
        }
    }
}
