import java.util.Objects;

public class Doctor extends Employee {

    private String specialty;
    private int medicalID;



    public Doctor() {
    }

    public Doctor(String name, String id, int age, String specialty, int medicalID, long salary) {
        super(name, id, age,salary);
        this.specialty = specialty;
        this.medicalID = medicalID;

    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getMedicalID() {
        return medicalID;
    }

    public void setMedicalID(int medicalID) {
        this.medicalID = medicalID;
    }

    @Override
    public String toString() {
        return "Doctor " +
                ", name='" + name +
                "specialty='" + specialty + '\'' +
                ", medicalID=" + medicalID  + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return medicalID == doctor.medicalID && Objects.equals(specialty, doctor.specialty);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialty, medicalID);
    }
}
