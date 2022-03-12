import java.util.Objects;

public class Patient extends Person implements Comparable<Object> {

    private int patientNumber; // number in the hospital system
    private String medicalInsurance;

    public Patient(String name, String id, int age, String medicalInsurance, int patientNumber) {
        super(name, id, age);
        this.medicalInsurance = medicalInsurance;
        this.patientNumber = patientNumber;
    }

    public int getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(int patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getMedicalInsurance() {
        return medicalInsurance;
    }

    public void setMedicalInsurance(String medicalInsurance) {
        this.medicalInsurance = medicalInsurance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return patientNumber == patient.patientNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientNumber);
    }

    @Override
    public int compareTo(Object o) {
        Patient patient = (Patient) o;
        if(this.patientNumber<patient.patientNumber)
            return -1;
        else{
            if(this.patientNumber>patient.patientNumber)
                return 1;
        }
        return  0;
    }

    @Override
    public String toString() {
        return "Patient= "+this.name + "Id: "+this.id +
                "patientNumber=" + patientNumber +
                ", medicalInsurance='" + medicalInsurance ;
    }
}
