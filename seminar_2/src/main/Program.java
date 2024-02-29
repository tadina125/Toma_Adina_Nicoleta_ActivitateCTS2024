package main;

import classes.Aplicant;
import classes.readers.AngajatReader;
import classes.readers.ApplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		ApplicantReader angajatReader = new AngajatReader("angajati.txt");
		try {
			listaAngajati = angajatReader.read();
			for(Aplicant angajat:listaAngajati)
				System.out.println(angajat.toString());
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}

}
