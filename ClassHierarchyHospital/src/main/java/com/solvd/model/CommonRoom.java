package com.solvd.model;

import com.solvd.exceptions.FullRoomException;

import java.util.ArrayList;

public class CommonRoom extends Room {
    private int capacity;
    ArrayList<Patient> patients = new ArrayList<>();

    public CommonRoom() {
    }

    public CommonRoom(int price, int roomNumber, int capacity) {
        super(price, roomNumber);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public void addPatient(Patient p) throws FullRoomException {
        if(this.patients.size()<=this.capacity){
            this.patients.add(p);
            this.capacity--;
        }
        else
            throw new FullRoomException("The room is full");
    }

    @Override
    public String toString() {
        return super.toString() + " Type: com.solvd.model.CommonRoom ";
    }
}
