package classes.readers;

import classes.Angajat;
import classes.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends ApplicantReader {
    public AngajatReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(this.fileName));
        scanner.useDelimiter(",");
        ArrayList angajati = new ArrayList();

        while(scanner.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(scanner, angajat);
            int salariu = scanner.nextInt();
            String ocupatie = scanner.next();
            angajat.setOcupatie(ocupatie);
            angajat.setSalariu(salariu);
            angajati.add(angajat);
        }

        scanner.close();
        return angajati;
    }
}
