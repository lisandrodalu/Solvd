public class Doctor extends Person{

    private String specialty;
    private int medicalID;
    private long salary;


    public Doctor() {
    }

    public Doctor(String name, String id, int age, String specialty, int medicalID, long salary) {
        super(name, id, age);
        this.specialty = specialty;
        this.medicalID = medicalID;
        this.salary = salary;
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}
