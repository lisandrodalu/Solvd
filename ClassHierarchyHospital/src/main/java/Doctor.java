public class Doctor extends Worker{

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


}
