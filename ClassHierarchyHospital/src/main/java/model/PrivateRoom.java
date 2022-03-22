package model;

public class PrivateRoom extends Room{

    private Patient patient; // only one
    private boolean free;
    public PrivateRoom() {
    }

    public PrivateRoom(int price, int capacity, Patient patient) {
        super(price, capacity);
        this.patient = patient;
        this.free = true;

    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public void addPatient(Patient p) {
        if(this.free)
            this.patient = p;
    }
}
