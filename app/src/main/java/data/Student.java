package data;

public class Student {
    private String prename;
    private String surname;
    private Course course;
    private int matriculationNumber;

    public enum Course {
       AI,
        WI,
        MI,
        UI,
        BWL,
        GD;
    }

    public Student(String prename, String surname, Course course, int matriculationNumber) {
        super();
        this.prename = prename;
        this.surname = surname;
        this.course = course;
        this.matriculationNumber = matriculationNumber;
    }

    public String getPrename() {
        return prename;
    }

    public void setPrename(String prename) {
        this.prename = prename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Course getCourse() {
        return course;
    }

    public void setStudiengang(Course course1) {
        this.course = course1;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    @Override
    public String toString() {
        return "Student [prename=" + prename + ", surname=" + surname + ", course=" + course + ", matriculationNumber="
                + matriculationNumber + "]";
    }

}

