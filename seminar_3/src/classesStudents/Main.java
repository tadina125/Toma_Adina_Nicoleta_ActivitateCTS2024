package classesStudents;

public class Main {
    public static void main(String[] args) {
        Student student_1 = new Student(10001, "Craciun Andrei", "craciun_andrei@gmail.com", 2);
        Student student_2 = new Student(10023, "Butacu Maria", "butacu_maria@gmail.com", 3);
        Student student_3 = new Student(10076, "Popescu Daniel", "popescu_daniel@gmail.com", 1);
        Student student_4 = new Student(10197, "Potcoava Sabin", "potcoava_sabin@gmail.com", 3);

        SustinereExamen poo = new SustinereExamen("POO");
        SustinereExamen cts = new SustinereExamen("CTS");


       poo.inregistrareStudent(student_1);
       poo.inregistrareStudent(student_2);
       poo.inregistrareStudent(student_2);
       cts.inregistrareStudent(student_1);
       cts.inregistrareStudent(student_1);
       cts.inregistrareStudent(student_1);
       cts.inregistrareStudent(student_4);
    }
}
