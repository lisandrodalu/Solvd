public class Doctor extends Person{

    private String specialty;
    private int medicalID;
    private long salary;


    public Doctor() {
    }

    public Doctor(String name, String id, String age, String specialty, int medicalID, long salary) {
        super(name, id, age);
        this.specialty = specialty;
        this.medicalID = medicalID;
        this.salary = salary;
    }
}
