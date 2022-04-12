package com.solvd.model;

import com.solvd.exceptions.FullRoomException;
import com.solvd.exceptions.NonExistantDoctorException;
import com.solvd.exceptions.NonExistantRoomException;
import com.solvd.exceptions.OccupiedAmbulanceException;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Hospital {
    private String name;
    private String city;
    private String adress;
    private WaitingRoom waitingRoom = new WaitingRoom();
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private Ambulance ambulance = new Ambulance();
    private PatientsDataBase patientsDataBase = new PatientsDataBase();


    public void Hospital(){}

    public Hospital(String name,String city, String adress) {
        this.name = name;
        this.city = city;
        this.adress = adress;

    }
    public void enterHospital(Patient p) throws FullRoomException {
        this.waitingRoom.enterPatient(p);
    }
    public void attendPatient(Patient p,int idDoctor) throws NonExistantDoctorException {
        this.waitingRoom.removePatient(p);
        Patient patient = this.patientsDataBase.searchPatient(p);
        Doctor doctor = searchDoctor(idDoctor);
        if(doctor!=null){
            if(patient == null){
                this.patientsDataBase.addPatient(p);
                p.addAppointment(doctor);
            }
            else
                patient.addAppointment(doctor);
        }
        else
            throw new NonExistantDoctorException("That doctor whith id: "+idDoctor+" does not exist in the system");
    }

    public void addDoctor(Doctor d){
        this.doctors.add(d);

    }
    public void addRoom(Room r){
        this.rooms.add(r);
    }
    public void assignRoom(int roomNumber,Patient p) throws FullRoomException, NonExistantRoomException {
         Room  room= searchRoom(roomNumber);
         if(room!=null)
         room.addPatient(p);
         else
             throw new NonExistantRoomException("The room with number "+roomNumber+" does not exist");
    }
    public void ambulanceTrip(Paramedic p,AmbulanceDriver driver) throws OccupiedAmbulanceException{
        if(this.ambulance.isFree()){
            this.ambulance.setFree(false);
            this.ambulance.setAmbulanceDriver(driver);
            this.ambulance.setParamedic(p);
        }
        else
            throw new OccupiedAmbulanceException("The ambulance is occupied");

    }
    public void ambulanceFree(){
        this.ambulance.setFree(true);
    }


    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

    public Room searchRoom(int number){
        return rooms.stream().filter(room -> room.getRoomNumber()==number).findFirst().orElse(null);
    }

    public Doctor searchDoctor(int number){
        return  doctors.stream().filter(doctor -> doctor.getMedicalID()==number).findFirst().orElse(null);
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public PatientsDataBase getPatientsDataBase() {
        return patientsDataBase;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

}
