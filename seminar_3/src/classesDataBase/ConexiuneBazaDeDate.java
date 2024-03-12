package classesDataBase;

public class ConexiuneBazaDeDate {
    private String numeBaza;
    private String linkConexiune;
    private Integer nrTabele;

    private static ConexiuneBazaDeDate instanta = null;

    private ConexiuneBazaDeDate(String numeBaza, String linkConexiune, Integer nrTabele) {
        this.numeBaza = numeBaza;
        this.linkConexiune = linkConexiune;
        this.nrTabele = nrTabele;
    }

    public String getNumeBaza() {
        return numeBaza;
    }

    public void setNumeBaza(String numeBaza) {
        this.numeBaza = numeBaza;
    }

    public String getLinkConexiune() {
        return linkConexiune;
    }

    public void setLinkConexiune(String linkConexiune) {
        this.linkConexiune = linkConexiune;
    }

    public Integer getNrTabele() {
        return nrTabele;
    }

    public void setNrTabele(Integer nrTabele) {
        this.nrTabele = nrTabele;
    }



    public static synchronized ConexiuneBazaDeDate getInstanta(String numeBaza, String linkConexiune, Integer nrTabele) {
        if (instanta == null) {
            instanta = new ConexiuneBazaDeDate(numeBaza, linkConexiune, nrTabele);
        }
        return instanta;
    }

    @Override
    public String toString() {
        return "ConexiuneBazaDeDate{" +
                "numeBaza='" + numeBaza + '\'' +
                ", linkConexiune='" + linkConexiune + '\'' +
                ", nrTabele=" + nrTabele +
                '}';
    }
}
