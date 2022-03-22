package model;

import exceptions.FullRoomException;

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
    public void addPatient(Patient p) throws FullRoomException {
        if(this.free) {
            this.patient = p;
        }
        else
            throw new FullRoomException("The room is full");
    }
}
