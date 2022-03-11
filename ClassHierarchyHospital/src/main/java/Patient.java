public class Patient extends Person{

    private String medicalInsurance;

    public Patient(String name, String id, String age, String medicalInsurance) {
        super(name, id, age);
        this.medicalInsurance = medicalInsurance;
    }
}
