package model;

import exceptions.FullRoomException;
import exceptions.NonExistantDoctorException;
import exceptions.NonExistantRoomException;
import exceptions.OccupiedAmbulanceException;

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
        Room room = null;
        for (int i=0;i<rooms.size();i++){
            if(rooms.get(i).getRoomNumber()==number)
                room = rooms.get(i);
        }
        return room;

    }
    public Doctor searchDoctor(int number){
        Doctor doctor = null;
        for (int i=0;i<doctors.size();i++){
            if(doctors.get(i).getMedicalID()==number)
                doctor = doctors.get(i);
        }
        return doctor;
    }
    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

}
