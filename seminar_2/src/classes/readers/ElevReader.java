package classes.readers;

import classes.Aplicant;
import classes.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends ApplicantReader {
    public ElevReader(String fileName) {
        super(fileName);
    }

    public List<Aplicant> read() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(this.fileName));
        scanner.useDelimiter(",|\n");
        ArrayList elevi = new ArrayList();

        while(scanner.hasNext()) {
            Elev elev = new Elev();
            super.readAplicant(scanner, elev);
            int clasa = scanner.nextInt();
            String tutore = scanner.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }

        scanner.close();
        return elevi;
    }
}
