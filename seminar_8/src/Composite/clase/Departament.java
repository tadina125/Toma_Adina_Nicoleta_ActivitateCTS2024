package Composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbstracta{
    private List<StructuraAbstracta> structuri;
    private String directorDepartament;

    public Departament(String nume, String directorDepartament) {
        super(nume);
        this.directorDepartament = directorDepartament;
        this.structuri = new ArrayList<>();
    }

    @Override
    public void adaugaStructura(StructuraAbstracta structuraAbstracta) {
        structuri.add(structuraAbstracta);
    }

    @Override
    public void stergeStructura(StructuraAbstracta structuraAbstracta) {
        structuri.remove(structuraAbstracta);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if(index >= 0 && index < this.structuri.size()){
            return this.structuri.get(index);
        }
            throw new IllegalArgumentException();
    }

    @Override
    public void afiseazaDescriere(String indentare) {
        System.out.println(indentare + "Departamentul " + super.getNume()
        + " condus de " + this.directorDepartament
        + " si are urmatoarea componenta : ");
        for(StructuraAbstracta sa:structuri){
            sa.afiseazaDescriere(indentare + "      ");
        }
    }
}
