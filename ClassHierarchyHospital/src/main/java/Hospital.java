import java.util.ArrayList;

public class Hospital {
    private String name;
    private String adress;
    private WaitingRoom waitingRoom;
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Doctor> doctors = new ArrayList<>();
    private Ambulance ambulance;



    public void Hospital(){}

    public Hospital(String name, String adress, WaitingRoom waitingRoom, ArrayList<Room> rooms, ArrayList<Doctor> doctors, Ambulance ambulance) {
        this.name = name;
        this.adress = adress;
        this.waitingRoom = waitingRoom;
        this.rooms = rooms;
        this.doctors = doctors;
        this.ambulance = ambulance;
    }
    public void enterHospital(Patient p){
        this.waitingRoom.enterPatient(p);
    }
    public void addDoctor(Doctor d){
        this.doctors.add(d);

    }
    public void assignRoom(Room r,Patient p){
         r.addPatient(p);
    }
}
