package model;

import exceptions.FullRoomException;

import java.util.ArrayList;

public class Hospital {
    private String name;
    private String city;
    private String adress;
    private WaitingRoom waitingRoom = new WaitingRoom();
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private Ambulance ambulance = new Ambulance();
    private PatientsDataBase patientsDataBase = new PatientsDataBase();
    private int number  = 0;



    public void Hospital(){}

    public Hospital(String name,String city, String adress) {
        this.name = name;
        this.city = city;
        this.adress = adress;

    }
    public void enterHospital(Patient p) throws FullRoomException {
        this.waitingRoom.enterPatient(p);
    }
    public void attendPatient(Patient p){
        this.waitingRoom.removePatient(p);
        this.patientsDataBase.addPatient(p);
    }
    public void addDoctor(Doctor d){
        this.doctors.add(d);

    }
    public void addRoom(Room r){
        this.rooms.add(r);
    }
    public void assignRoom(Room r,Patient p) throws FullRoomException {
         r.addPatient(p);
    }
    public void ambulanceTrip(Paramedic p,AmbulanceDriver driver){
        this.ambulance.setFree(false);
        this.ambulance.setAmbulanceDriver(driver);
        this.ambulance.setParamedic(p);
    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

}
