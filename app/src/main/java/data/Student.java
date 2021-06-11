package data;

public class Student {
    private String prename;
    private String surname;
    private String studiengang;
    private int matriculationNumber;

    public Student(String prename, String surname, String studiengang, int matriculationNumber) {
        super();
        this.prename = prename;
        this.surname = surname;
        this.studiengang = studiengang;
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

    public String getStudiengang() {
        return studiengang;
    }

    public void setStudiengang(String studiengang) {
        this.studiengang = studiengang;
    }

    public int getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(int matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }

    @Override
    public String toString() {
        return "Student [prename=" + prename + ", surname=" + surname + ", course=" + studiengang + ", matriculationNumber="
                + matriculationNumber + "]";
    }

}

