package Proxy.clase;

public class ProxyGen implements Vanzare{
    private Vanzare vanzareBilet;
    private String genAcceptat ="feminin";

    public ProxyGen(Vanzare vanzareBilet, String genAcceptat) {
        this.vanzareBilet = vanzareBilet;
        this.genAcceptat = genAcceptat;
    }

    @Override
    public void vanzare(Persoana persoana) {
        if(persoana.getGen()== genAcceptat){
            vanzareBilet.vanzare(persoana);
        }else{
            System.out.println("Persoana "+persoana.getNume()+" are genul "+persoana.getGen()
                    +"  si nu poate achizitiona biletul, deoarece acest eveniment este dedicat persoanelor doar de genul "+this.genAcceptat);
        }
    }
}
