package classesStudents;

public class Student {
    private Integer id;
    private String nume;
    private String email;
    private Integer an;

    public Student(Integer id, String nume, String email, Integer an) {
        this.id = id;
        this.nume = nume;
        this.email = email;
        this.an = an;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAn() {
        return an;
    }

    public void setAn(Integer an) {
        this.an = an;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", email='" + email + '\'' +
                ", an=" + an +
                '}';
    }
}
