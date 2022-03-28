package com.solvd.model;

import com.solvd.exceptions.FullRoomException;

import java.util.ArrayList;

public class WaitingRoom {
     private int capacity;
    ArrayList<Patient> patients = new ArrayList<>();
    public WaitingRoom() {
        this.capacity = 50; // 50 persons
    }

    public WaitingRoom(int capacity, ArrayList<Patient> patients) {
        this.capacity = capacity;
        this.patients = patients;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void enterPatient(Patient p) throws FullRoomException {
        if(capacity>0)
        {
            this.capacity--;
            this.patients.add(p);
        }
        else
            throw new FullRoomException("The room is full");

    }
    public void removePatient(Patient p){
        this.capacity++;
        this.patients.remove(p);

    }
}
