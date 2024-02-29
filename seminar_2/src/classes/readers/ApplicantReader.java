package classes.readers;

import classes.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ApplicantReader {
    protected String fileName;

    public ApplicantReader(String fileName) {
        this.fileName = fileName;
    }

    public void readAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = input.next().toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[nr];

        for(int i = 0; i < nr; ++i) {
            vect[i] = input.next();
        }

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setNr_proiecte(nr, vect);
        aplicant.setPunctaj(punctaj);
    }

    public abstract List<Aplicant> read() throws FileNotFoundException;
}

