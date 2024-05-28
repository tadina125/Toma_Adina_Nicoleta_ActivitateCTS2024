package test.dubluri;

import clase.IPersoana;

public class PersoanaFake implements IPersoana {
    private String valoareaGetSex;
    private int valoareGetVarsta;
    private boolean valoareGetCheckCNP;




    @Override
    public String getSex() {
        return valoareaGetSex;
    }

    @Override
    public int getVarsta() {
        return valoareGetVarsta;
    }

    @Override
    public boolean checkCNP() {
        return valoareGetCheckCNP;
    }

    public void setValoareaGetSex(String valoareaGetSex) {
        this.valoareaGetSex = valoareaGetSex;
    }

    public void setValoareGetVarsta(int valoareGetVarsta) {
        this.valoareGetVarsta = valoareGetVarsta;
    }

    public void setValoareGetCheckCNP(boolean valoareGetCheckCNP) {
        this.valoareGetCheckCNP = valoareGetCheckCNP;
    }
}
