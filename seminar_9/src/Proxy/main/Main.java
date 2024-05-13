package Proxy.main;

import Proxy.clase.*;

public class Main {
    public static void main(String[] args) {
        Vanzare vanzare=new VanzareBilet("Steaua-Dinamo",23);
        Persoana persoana1=new Persoana("Ionut",13,"masculin");
        vanzare.vanzare(persoana1);
        Persoana persoana2=new Persoana("Ana",15,"feminin");
        vanzare.vanzare(persoana2);

        Vanzare proxyVarsta=new ProxyVarsta(vanzare);
        proxyVarsta.vanzare(persoana1);
        proxyVarsta.vanzare(persoana2);

        Vanzare proxyGen=new ProxyGen(proxyVarsta,"masculin");
        proxyGen.vanzare(persoana1);
        proxyGen.vanzare(persoana2);
    }
}
