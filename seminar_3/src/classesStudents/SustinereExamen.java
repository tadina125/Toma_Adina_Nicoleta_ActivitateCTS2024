package classesStudents;

import java.util.HashMap;
import java.util.Map;
import classesStudents.Student;

public class SustinereExamen {
    private String nume;

     Map<Integer, Student> listaStudenti = new HashMap<>();

    public SustinereExamen(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;

    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Map<Integer, Student> getListaStudenti() {
        return listaStudenti;
    }

    public void inregistrareStudent(Student student) {
        if(listaStudenti.containsKey(student.getId())) {
            System.out.println("Studentul " + student.getNume() + " nu poate sustine examenul !");
        }
        else {
            listaStudenti.put(student.getId(), student);
            System.out.println("Studentul " + student.getNume() + " poate sustine examenul.");
        }
    }
}
